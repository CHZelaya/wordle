package org.example;

public class GameLogic {

    public static void handleGameLogic(String userGuess, String chosenWord) {
// * Initialize string builder to allow for string manipulation
        StringBuilder result = new StringBuilder();
//  * boolean array to check for matched characters
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
