package com.example.dec2hex;

import java.util.logging.Logger;
import java.util.logging.Level;

public class Dec2Hex {

    private static final Logger logger = Logger.getLogger(Dec2Hex.class.getName());

    public static String convertToHex(int num) {
        if (num <= 0) {
            // Return an empty string for zero or negative inputs
            return "";
        }

        // Array for hex characters
        char[] ch = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int rem;
        StringBuilder hexadecimal = new StringBuilder();

        // Loop to convert decimal to hexadecimal
        while (num != 0) {
            rem = num % 16;
            hexadecimal.insert(0, ch[rem]);
            num = num / 16;
        }
        return hexadecimal.toString();
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            logger.severe("Error: No input argument provided. Please provide an integer.");
            return;
        }

        try {
            int arg1 = Integer.parseInt(args[0]);
            if (logger.isLoggable(Level.INFO)) {
                logger.info(String.format("Hexadecimal Representation: %s", convertToHex(arg1)));
            }
        } catch (NumberFormatException e) {
            logger.severe("Error: Invalid input. Please provide a valid integer.");
        }
    }
}

