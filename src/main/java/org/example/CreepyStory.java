package org.example;

public class CreepyStory {

    // Method for Level 1: The Awakening
    public void levelOne() {
        System.out.println("Level One");
        System.out.println("In the dim light of a forgotten library, dust motes danced in the air, swirling around ancient tomes that whispered secrets of the past.\n" +
                "As you wandered deeper into the labyrinth of shelves, you stumbled upon a peculiar book, its cover adorned with strange symbols that shimmered in the low light.\n" +
                "The moment you opened it, a gust of wind extinguished the flickering candlelight, plunging you into darkness.\n" +
                "A voice echoed through the shadows, 'You have awakened me. To move forward, you must solve the puzzle that lies before you.'\n");
    }

    // Method for Player Chooses to Leave After Level 1
    public void playerChoosesToLeaveAfterLevelOne() {
        System.out.println("You feel a chill run down your spine as you consider the darkness that surrounds you.\n" +
                "With a heavy heart, you close the book and step back into the light.\n" +
                "As you exit the library, the whispers fade, and you find solace in the outside world.\n" +
                "You may have escaped the shadows, but the mysteries of the library will haunt you forever.\n" +
                "You chose to leave.\n");
    }

    // Method for Level 2: The Shadows Stir
    public void levelTwo() {
        System.out.println("Level Two");
        System.out.println("As you begin your first round of the Wordle puzzle, the air grows colder.\n" +
                "The voice returns, now more insistent. 'You think you can escape? Each guess you make will draw the shadows closer. Solve the word, or they will consume you. Remember, you have six chances. Choose wisely.'\n");
    }

    // Method for Player Chooses to Leave After Level 2
    public void playerChoosesToLeaveAfterLevelTwo() {
        System.out.println("You feel a chill run down your spine as you consider the darkness that surrounds you.\n" +
                "With a heavy heart, you close the book and step back into the light.\n" +
                "As you exit the library, the whispers fade, and you find solace in the outside world.\n" +
                "You may have escaped the shadows, but the mysteries of the library will haunt you forever.\n" +
                "You chose to leave.\n");
    }

    // Method for Level 3: The Whispers
    public void levelThree() {
        System.out.println("Level Three");
        System.out.println("With each correct guess, the whispers in the library grow louder, swirling around you like a tempest.\n" +
                "'You are getting closer,' the voice taunts. 'But beware, for every wrong guess brings forth the darkness. Can you decipher the word before it engulfs you? The clock is ticking, and the shadows are hungry.'\n");
    }

    // Method for Player Chooses to Leave After Level 3
    public void playerChoosesToLeaveAfterLevelThree() {
        System.out.println("You feel a chill run down your spine as you consider the darkness that surrounds you.\n" +
                "With a heavy heart, you close the book and step back into the light.\n" +
                "As you exit the library, the whispers fade, and you find solace in the outside world.\n" +
                "You may have escaped the shadows, but the mysteries of the library will haunt you forever.\n" +
                "You chose to leave.\n");
    }

    // Method for Level 4: The Final Confrontation
    public void levelFour() {
        System.out.println("Level Four");
        System.out.println("With only one guess left, the tension is palpable. The voice grows frantic, echoing through the library.\n" +
                "'You must answer me! What is the password that unlocks the door to the truth? The fate of your soul hangs in the balance. Solve the Wordle puzzle, or be lost forever among the forgotten pages.'\n");
    }

    // Method for Player Chooses to Leave After Level 4
    public void playerChoosesToLeaveAfterLevelFour() {
        System.out.println("You feel a chill run down your spine as you consider the darkness that surrounds you.\n" +
                "With a heavy heart, you close the book and step back into the light.\n" +
                "As you exit the library, the whispers fade, and you find solace in the outside world.\n" +
                "You may have escaped the shadows, but the mysteries of the library will haunt you forever.\n" +
                "You chose to leave.\n");
    }

    // Method for Ending 2: Solved the Password Puzzle
    public void endingSolved() {
        System.out.println("As you make your final guess, the library trembles, and the shadows swirl violently around you.\n" +
                "'You have done well to reach this point,' the voice intones, now almost reverent.\n" +
                "'You have solved the puzzle and unlocked the door to the truth. The path ahead is yours to explore, free from the shadows that once haunted you.\n" +
                "You have triumphed over the darkness.'\n");
    }

    // Method for Ending 3: Failed to Solve the Password Puzzle
    public void endingFailed() {
        System.out.println("With a heavy heart, you make your final guess, but the answer eludes you.\n" +
                "The library shakes, and the shadows close in.\n" +
                "'You have failed,' the voice whispers, echoing in your ears.\n" +
                "The darkness engulfs you, and you find yourself trapped within the library's walls, a mere echo of what once was.\n" +
                "The whispers will haunt you for eternity.\n");
    }

    public void nextLevel(int gameLevel) {
    switch (gameLevel) {
        case 2: levelTwo(); break;
        case 3: levelThree(); break;
        case 4: levelFour(); break;
    }
    }
}
