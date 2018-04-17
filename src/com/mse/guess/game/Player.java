package com.mse.guess.game;

/**
 * Created on 14/04/2018.
 */
public class Player {

    /**
     * Guess a number
     *
     * @return the guessed number
     */
    public int guess() {
        int number = (int) (Math.random() * 10);
        System.out.println("I am guessing " + number);

        return number;
    }
}