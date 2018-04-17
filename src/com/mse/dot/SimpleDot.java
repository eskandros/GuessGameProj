package com.mse.dot;

/**
 * Created by mseskander on 17/04/2018.
 */
public class SimpleDot {
    // hold cells
    int[] locations;
    //hold number of hits
    int numOfHits;

    public void setLocations(int[] locations) {
        this.locations = locations;
    }

    public void checkLocation(String guess) {
        int loc = Integer.parseInt(guess);

        int count = 0;
        String result = "miss";
        for (int i=0;  i<locations.length; i++){
            if (loc == locations[i]) {
                result = "hit";
                numOfHits++;
            }
        }

        System.out.println("hit");
    }

    public void setCells(int[] cellLocations) {

    }
}