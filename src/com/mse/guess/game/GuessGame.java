package com.mse.guess.game;

/**
 * Created on 14/04/2018.
 */
public class GuessGame {
//    Player p1;
//    Player p2;
//    Player p3;

    /**
     * Start the game ...
     */
    public void startGame() {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        int guessP1 = 0;
        int guessP2 = 0;
        int guessP3 = 0;

        boolean p1IsRight = false;
        boolean p2IsRight = false;
        boolean p3IsRight = false;

        int targetNumber = (int)(Math.random() * 10);
        System.out.println("I am thinking of a number between 1 and 9 .....");

        while (true){
            System.out.println("Number to guess is " + targetNumber);
            guessP1 = p1.guess();
            System.out.println("Player 1 guessed " + guessP1);
            guessP2 = p2.guess();
            System.out.println("Player 2 guessed " + guessP2);
            guessP3 = p3.guess();
            System.out.println("Player 3 guessed " + guessP3);

            if (guessP1 == targetNumber) {
                p1IsRight = true;
            }
            if (guessP2 == targetNumber) {
                p2IsRight = true;
            }
            if (guessP3 == targetNumber) {
                p3IsRight = true;
            }
            if (p1IsRight || p2IsRight || p3IsRight) {
                System.out.println("We have a winner");
                System.out.println("Player 1 got it right? " + p1IsRight);
                System.out.println("Player 2 got it right? " + p2IsRight);
                System.out.println("Player 3 got it right? " + p3IsRight);
                System.out.println("The game is over.");
                break;
            } else {
                System.out.println("Players will try again." );
            }
        }
    }
}