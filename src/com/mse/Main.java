package com.mse;

import com.mse.arrays.book;
import com.mse.guess.game.GuessGame;

public class Main {

    /**
     * main
     *
     * @param args
     */
    public static void main(String[] args) {
        // use these lines to run the guess game
        playGuessGame();

        System.out.println("*********************************************");
        System.out.println("*********************************************");

        // use these lines to run the book array
        arrayPractice();

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
}
