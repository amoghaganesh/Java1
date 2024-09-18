package com.xworkz.city;

public class City {
    private String[] cityNames = new String[7];
    private int index;

    public void store(String Name)
    {
        this.cityNames[this.index] = Name;
        this.index++;
    }
    public void display()
    {
        for(String ref : cityNames)
        {
            System.out.println(ref);
        }
    }
    public static void main(String[] args)
    {
        City city = new City();
        city.store("Banglore");
        city.store ("Mysore");
        city.store ("Vijayapur");
        city.store ("Chitradurga");
        city.store("Belagavi");
        city.store("Bagalakot");
        city.store("Gulbarg");

        city.display();
    }
}
