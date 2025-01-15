package org.example;

public class CreepyStory {

    // Method for Level 1: The Awakening
    public void levelOne() {
        System.out.println("Level One");
        System.out.println("In the dim light of a forgotten library, dust motes danced in the air, swirling around ancient tomes that whispered secrets of the past.\n" +
                "As you wandered deeper into the labyrinth of shelves,\n you stumbled upon a peculiar book, its cover adorned with strange symbols that shimmered in the low light.\n" +
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
                "The voice returns, now more insistent. \n'You think you can escape? Each guess you make will draw the shadows closer. Solve the word, or they will consume you. Remember, you have six chances. Choose wisely.'\n");
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
        System.out.println("With only one guess left, the atmosphere thickens with dread. The voice grows frantic, echoing through the library's vast hallways.\n" +
                "'You must make your choice now! The shadows are closing in, and their hunger for your soul is insatiable. Every second counts—solve the puzzle or be consumed by the darkness that lingers here. Will you rise to the challenge, or will you let fear take hold?'\n");
    }

    // Method for Player Chooses to Leave After Level 4
    public void playerChoosesToLeaveAfterLevelFour() {
        System.out.println("You feel a chill run down your spine as you consider the darkness that surrounds you.\n" +
                "With a heavy heart, you close the book and step back into the light.\n" +
                "As you exit the library, the whispers fade, and you find solace in the outside world.\n" +
                "You may have escaped the shadows, but the mysteries of the library will haunt you forever.\n" +
                "You chose to leave.\n");
    }


    // Method for Level 5: The Ghost's Demand
    public void levelFive() {
        System.out.println("Level Five");
        System.out.println("As the final echoes of the voice fade, a chilling silence envelops you. Suddenly, the air thickens, and a ghostly figure materializes before you, its eyes glowing with an otherworldly light.\n" +
                "'You have come far, but the journey is not yet over,' it whispers, its voice a haunting melody. 'To truly escape, you must confront the shadows that dwell within you. Only by facing your deepest fears can you hope to break free. Will you dare to look into the darkness and reveal what lies beneath?'\n");
    }

    // Method for Level 6: The Final Choice
    public void levelSix() {
        System.out.println("Level Six");
        System.out.println("The ghost's words resonate within you, stirring memories of your past fears and regrets. The shadows around you pulse with anticipation, waiting for your response.\n" +
                "'Face your fears, and the path to freedom will be revealed,' the ghost urges. 'What do you see in the darkness? Speak your truth, and the shadows will either release you or bind you forever.'\n" +
                "With your heart racing, you take a deep breath and prepare to confront the darkness that has haunted you for so long...\n");
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
        case 5: levelFive(); break;
    }
    }
}
