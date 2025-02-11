package com.xworkz.handling_Exception;

public class ArithmeticExceptionExample {
    public static void calculatePercentage(int totalMarks, int obtainedMarks) {
        try {
            if (totalMarks == 0) {
                throw new ArithmeticException("Total marks cannot be zero.");
            }
            double percentage = (obtainedMarks * 100.0) / totalMarks; 
            System.out.println("Percentage: " + percentage + "%");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }

    public static void main(String[] args) {
        calculatePercentage(100, 80); // Passing 0 as totalMarks to trigger exception
    }
}
