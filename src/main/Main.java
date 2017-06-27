package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static main.converter.NumberToWords.convert;

public class Main {

    public static void main(String[] args) {
        /* Read a line from the standard input (console) */
        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
        
        /* Convert the input */
        String outputString = convert(inputString);
        
        /* Write the output to standard output (console) */
        System.out.println(outputString);
    }
}
