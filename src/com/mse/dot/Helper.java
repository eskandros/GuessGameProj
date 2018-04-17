package com.mse.dot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created on 17/04/2018.
 */
public class Helper {

    public String getUserInput(String prompot) {
        String userInput = null;
        System.out.print(prompot + ": ");
        try{
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(System.in));
            userInput = br.readLine();
            if (userInput.length() == 0){
                return null;
            }

        }catch (IOException ioException) {
            System.out.println("IOException: " + ioException);
        }

        return userInput;
    }
}