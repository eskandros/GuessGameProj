package com.mse.dot;

/**
 * Created on 17/04/2018.
 */
public class SimpleDot {
    // hold cells
    private int[] locations;
    //hold number of hits
    private int numOfHits;

    public void setLocations(int[] locations) {
        this.locations = locations;
    }

    public String checkUserGuess(String stringGuess) {
        String result = "miss";

        try {
            int guess = Integer.parseInt(stringGuess);

            // there is a bug in the code. Say the cell array is (1,2,3),
            // the program will give the "kill" result if the guesses are 2,2,2
            // this issue is resolved in the SimpleDot2 class.
            for (int cell : locations) {
                if (guess == cell) {
                    result = "hit";
                    numOfHits++;
                    break;
                }
            }

            if (numOfHits == locations.length) {
                System.out.println(result);
                result = "kill";
            }
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException : " + e);
        }
        System.out.println(result);
        return result;
    }

}