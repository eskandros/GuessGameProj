package com.mse.dot;

import java.util.ArrayList;

/**
 * Created on 17/04/2018.
 */
public class SimpleDot2 {
    private ArrayList<String> locations = new ArrayList<String>();
    private int numOfHits;

    public void setLocations(ArrayList locations) {
        this.locations = locations;
    }

    public String checkUserGuess(String stringGuess) {
        String result = "miss";

        if (locations.isEmpty()){
            System.out.println("The array list is empty");
            return "kill";
        }

        boolean isExist = locations.contains(stringGuess);
        System.out.println("isExist: " + isExist);
        int index = locations.indexOf(stringGuess);
        System.out.println("index: " + index);
        if (index != -1 ){
            result = "hit";
            numOfHits++;
            //locations.remove(guess);
            locations.remove(index);
        }

        if (locations.isEmpty()) {
            System.out.println(result);
            result = "kill";
        }

        System.out.println(result);
        return result;

    }
}