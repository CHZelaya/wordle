package org.example;

import java.util.ArrayList;


public class WordsList {
     static String ChosenWord;

    static public String getChosenWord() {

//       * Create ArrayList containing random words.
        //* Declaring Variables and ArrayList containing twenty five letter words
        ArrayList<String> fiveLetterWords = new ArrayList<>();
        fiveLetterWords.add("apple");
        fiveLetterWords.add("grape");
        fiveLetterWords.add("peach");
        fiveLetterWords.add("berry");
        fiveLetterWords.add("mango");
        fiveLetterWords.add("lemon");
        fiveLetterWords.add("cherry");
        fiveLetterWords.add("plumb");
        fiveLetterWords.add("melon");
        fiveLetterWords.add("olive");
        fiveLetterWords.add("candy");
        fiveLetterWords.add("honey");
        fiveLetterWords.add("tiger");
        fiveLetterWords.add("zebra");
        fiveLetterWords.add("quilt");
        fiveLetterWords.add("flame");
        fiveLetterWords.add("storm");
        fiveLetterWords.add("cloud");
        fiveLetterWords.add("dream");
        fiveLetterWords.add("light");

//      *Choosing one word at random
        int randomIndex = (int) (Math.random() * fiveLetterWords.size());
        String RandomWord = fiveLetterWords.get(randomIndex);


        return WordsList.ChosenWord = RandomWord;
    }

}
