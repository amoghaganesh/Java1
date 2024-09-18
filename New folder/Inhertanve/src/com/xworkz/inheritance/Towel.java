package com.xworkz.inheritance;

public class Towel {

    public int quantity;
    public int price;
    public String material;

    public void wash()
    {
        System.out.println("created wash in Towel");
    }

    public void wipe()
    {
        System.out.println("created wipe in Towel");
    }

    static {
        System.out.println("created static blck in Towel");
    }

}
