package com.xworkz.handling_Exception;

public class StringIndexOutOfBoundsExample {
    public static void main(String[] args) {
        String str = "Hellohelloq";
        try {
            char ch = str.charAt(10);
            System.out.println("Character at index 10: " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
