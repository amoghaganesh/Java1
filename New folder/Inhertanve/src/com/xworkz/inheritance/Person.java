package com.xworkz.inheritance;

public class Person {

    String name;
    String email;
    int age;
    String mobileNo;

    // Constructor
    public Person(String name, String email, int age, String mobileNo) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.mobileNo = mobileNo;
    }

    // Method to display details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Age: " + age);
        System.out.println("Mobile No: " + mobileNo);
        System.out.println("-------------------------");
    }
}
