package com.xworkz.handling_Exception;

import java.util.Scanner;
import java.util.InputMismatchException;

public class InputMismatchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();
            System.out.println("You entered: " + number);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter an integer.");
        } finally {
            scanner.close();
            System.out.println("Scanner closed.");
        }
    }
}
