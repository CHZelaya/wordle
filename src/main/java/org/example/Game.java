package org.example;

import java.util.Scanner;

public class Game {
    private boolean gameOn;
    private int gameLevel;
    private String chosenWord;
    private Scanner scanner;
    private CreepyStory creepyStory;

    public Game(){
        this.scanner = new Scanner(System.in);
        this.creepyStory = new CreepyStory();
        this.gameOn = true;
        this.gameLevel = 1;
        this.chosenWord = WordsList.getChosenWord();
    }

    public void start(){
        System.out.println("**** Starting Wordle Game ****");
        System.out.println("Selected word for testing purposes: " + chosenWord);
        creepyStory.levelOne();

        while (gameOn){
            System.out.println("Game Level: " + gameLevel);
            String userGuess = scanner.nextLine().toLowerCase();
            handleInput(userGuess);
        }
        scanner.close();
        System.out.println("**** Ending Wordle Game ****");
    }

    private void handleInput(String userGuess) {
        String regex = "^[a-zA-Z]{5}$";

        if (!userGuess.matches(regex) || userGuess.isBlank()){
            System.out.println("Please enter a valid word");
        } else {
             if (userGuess.equalsIgnoreCase(chosenWord)) {
                handleCorrectGuess();
            } else {
                GameLogic.handleGameLogic(userGuess, chosenWord);
            }
        }
    }

    private void handleCorrectGuess() {
        System.out.println("Correct guess: " + chosenWord);
        chosenWord = "";
        System.out.println("Would you like to continue? (Y/N)");
        String playAgain = scanner.nextLine().toLowerCase();

        if (playAgain.equals("y") || playAgain.equals("yes")){
            resetGame();
        } else {
            System.out.println("Goodbye");
            gameOn = false;
        }
    }

    private void handleFinalGuess() {
        chosenWord = "ghost";
        String finalGuess = scanner.nextLine().toLowerCase();

        if (finalGuess.equals(chosenWord)){
            creepyStory.endingSolved();
            gameOn = false;
        } else {
            creepyStory.endingFailed();
            gameOn = false;
        }
    }

    private void resetGame() {
        if (gameLevel == 5) {
            creepyStory.levelSix();
            handleFinalGuess();
        } else {
        System.out.println("Game has been reset");
        ++gameLevel;
        creepyStory.nextLevel(gameLevel);
        chosenWord = WordsList.getChosenWord();
        System.out.println(chosenWord);
        }
    }


} // !Class
