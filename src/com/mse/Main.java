package com.mse;

import com.mse.arrays.book;
import com.mse.dot.SimpleDot;
import com.mse.guess.game.GuessGame;

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
        playDotGame();
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
        String result = simpleDot.checkLocation(guess);

        String testResult = "failed";
        if (result.equals("hit")) {
            testResult = "passed";
        }

        System.out.println(testResult);
    }
}
