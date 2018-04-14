package com.mse.guess.game;

/**
 * Created by mseskander on 14/04/2018.
 */
public class Player {
    private int number;

    public int guess() {
        number = (int) (Math.random() * 10);
        System.out.println("I am guessing " + number);

        return number;
    }
}