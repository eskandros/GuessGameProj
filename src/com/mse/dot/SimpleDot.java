package com.mse.dot;

/**
 * Created by mseskander on 17/04/2018.
 */
public class SimpleDot {
    // hold cells
    private int[] locations;
    //hold number of hits
    private int numOfHits;

    public void setLocations(int[] locations) {
        this.locations = locations;
    }

    public String checkLocation(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);

        String result = "miss";
        for (int cell : locations) {
            if (guess == cell) {
                result = "hit";
                numOfHits++;
                break;
            }
        }

        if (numOfHits == locations.length) {
            result = "kill";
        }
        System.out.println(result);

        return result;
    }

}