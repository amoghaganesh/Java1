package com.xworkz.handling_Exception;

import java.io.*;

public class IOExceptionExample {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter something: ");
            String input = reader.readLine();
            throw new IOException("Manually throwing IOException");
        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
