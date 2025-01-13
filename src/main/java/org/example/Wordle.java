package org.example;
import java.util.Scanner;

public class Wordle {
    public static void main(String[] args) {
/*
TODO: Polish, User experience can be improved upon, play again feature does not have let player know that the game has restarted.
TODO: Research color coding the characters in the console.
TODO: Input validation does not handle whitespace leading/trailing the user input.
TODO: ADD CREEPY STORY THAT CONTINUES EVERYTIME SOMEONE PLAYS AGAIN, OTHERWISE ADD OMINOUS MESSAGE AND RESET ACCUMULATOR.
TODO: CREATE CYPHER OUT OF DIFFERENT ARRAYLISTS TO SPELL OUT A WORD THAT WILL END THE STORY.
 */

        //! Regex pattern for a five-letter word
        String regex = "^[a-zA-Z]{5}$";
//        * Declare Scanner
        Scanner sc = new Scanner(System.in);

//        * Game Variables/Properties/Methods
        boolean gameOn = true;

        String chosenWord = WordsList.getChosenWord();
        System.out.println("***** STARTING WORDLE *****");
        System.out.println("Selected word for testing purposes: \n" + (chosenWord));
        System.out.println();


        System.out.println("Lets play a game! Please enter the word you would like to play");

        while (gameOn) {

            String userGuess = sc.nextLine().toLowerCase();

            if (!userGuess.matches(regex) || userGuess.isBlank()) {
                System.out.println("Please enter a five letter word, no numbers, special characters, or blank spaces please");
            } else {

                System.out.println("userGuess: " + userGuess);
                System.out.println("chosenWord: " + chosenWord);

                if (userGuess.equals(chosenWord)) {
                    System.out.println("You played a word, and won!");
                    gameOn = false;
                    chosenWord = "";
                    System.out.println("Would you like to play again? (y/n)");
                    String playAgain = sc.nextLine().toLowerCase();

                    if (playAgain.equalsIgnoreCase("y") || playAgain.equalsIgnoreCase("yes")) {
                        System.out.println("Game has been reset and a new word has been chosen. You can now play again!");
                        gameOn = true;
                        chosenWord = WordsList.getChosenWord();
                        System.out.println(chosenWord);

                    } else {
                        System.out.println("Thanks for playing!");
                        gameOn = false;
                        sc.close();
                        System.out.println("Goodbye!");
                    }

                } else {
//               * Initialize string builder to allow for string manipulation
                    StringBuilder result = new StringBuilder();
//               * boolean array to check for matched characters
                    boolean[] isMatched = new boolean[5];


//              * First pass checking for correct character and index.
                    for (int i = 0; i < 5; i++) {
                        if (userGuess.charAt(i) == chosenWord.charAt(i)) {
                            result.append(Character.toUpperCase(userGuess.charAt(i)));
                            isMatched[i] = true;
                        } else {
                            result.append(Character.toLowerCase(userGuess.charAt(i)));
                        }
                    }

//            * Second pass checking for correct character and incorrect index
                    for (int i = 0; i < 5; i++) {
                        if (userGuess.charAt(i) == chosenWord.charAt(i)) {
                            continue;
                        }
                        boolean found = false;
                        for (int j = 0; j < 5; j++) {
                            if (userGuess.charAt(i) == chosenWord.charAt(j) && !isMatched[j]) {
                                result.setCharAt(i, Character.toLowerCase(userGuess.charAt(i)));

                                isMatched[j] = true;
                                found = true;
                                break;
                            }
                        }
//              * If not found, replace with an underscore.
                        if (!found) {
                            result.setCharAt(i, '_');
                        }
                    }
//          * Print result
                    System.out.println("Result: " + result);
                }
            }

        } // While loop closing brace
    } // main method
} // class