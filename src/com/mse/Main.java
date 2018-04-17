package com.mse;

import com.mse.arrays.book;
import com.mse.dot.Helper;
import com.mse.dot.SimpleDot;
import com.mse.dot.SimpleDot2;
import com.mse.guess.game.GuessGame;

import java.util.ArrayList;

public class Main {

    /**
     * main
     *
     * @param args
     */
    public static void main(String[] args) {
        // use guess game
        playGuessGame();

        System.out.println("*********************************************");
        System.out.println("*********************************************");

        // run the array practice
        arrayPractice();

        System.out.println("*********************************************");
        System.out.println("*********************************************");

        // run dot guess game
//        playDotGame();
//        playDotGame2();
        playDotGame3();;
    }

    private static void playGuessGame() {
        GuessGame game = new GuessGame();
        game.startGame();
    }

    private static void arrayPractice() {

        book[] myBooks = new book[3];

        myBooks[0] = new book();
        myBooks[0].setTitle("Java");
        myBooks[1] = new book();
        myBooks[1].setTitle("The Java Cookbook");
        myBooks[2] = new book();
        myBooks[2].setTitle("The Java Webservice");

        myBooks[0].setAuthor("Terry");
        myBooks[1].setAuthor("Bob");
        myBooks[2].setAuthor("Andy");

        int i = 0;
        while (i < myBooks.length) {

            System.out.print(myBooks[i].getTitle());
            System.out.print( " by " );
            System.out.println(myBooks[i].getAuthor());
            i++;
        }
    }

    private static void playDotGame() {
        SimpleDot simpleDot = new SimpleDot();

        int[] locations = {2, 3, 4};

        simpleDot.setLocations(locations);

        String guess = "2";
        String result = simpleDot.checkUserGuess(guess);

        String testResult = "failed";
        if (result.equals("hit")) {
            testResult = "passed";
        }
        System.out.println(testResult);
    }

    private static void playDotGame2() {
        boolean active = true;
        int numberOfGuesses = 0;
        SimpleDot simpleDot = new SimpleDot();

        int cellValue = (int)(Math.random()*5);
        int[] locations = {cellValue, cellValue+2, cellValue+4};
        simpleDot.setLocations(locations);

        Helper helper = new Helper();

        while (active) {
            // get user guess
            String guess = helper.getUserInput("Enter a number: ");

            String result = simpleDot.checkUserGuess(guess);
            numberOfGuesses++;
            if (result!=null && result.equals("kill")) {
                active = false;
                System.out.println("Number of guess: " + numberOfGuesses);
            }

        }
    }

    private static void playDotGame3() {
        boolean active = true;
        int numberOfGuesses = 0;
        SimpleDot2 simpleDot = new SimpleDot2();

        int cellValue = (int)(Math.random()*5);
        ArrayList<String> locations = new ArrayList();
        locations.add(String.valueOf(cellValue));
        locations.add(String.valueOf(cellValue+2));
        locations.add(String.valueOf(cellValue+4));

        System.out.println("Value at index 0: " + locations.get(0));
        System.out.println("Value at index 1: " + locations.get(1));
        System.out.println("Value at index 2: " + locations.get(2));
        simpleDot.setLocations(locations);

        Helper helper = new Helper();

        while (active) {
            // get user guess
            String guess = helper.getUserInput("Enter a number: ");

            String result = simpleDot.checkUserGuess(guess);
            numberOfGuesses++;
            if (result!=null && result.equals("kill")) {
                active = false;
                System.out.println("Number of guess: " + numberOfGuesses);
            }

        }
    }
}
