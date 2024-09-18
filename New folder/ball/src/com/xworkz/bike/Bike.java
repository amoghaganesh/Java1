package com.xworkz.bike;

public class Bike {

    private String[] bikeNames =new String[7];
    private  int index;
    public void store(String name)
    {
        this.bikeNames[this.index]=name;
        this.index++;

    }
    public void display(){
        for(String ref:bikeNames){
            System.out.println(ref);
        }

    }

    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.store("KTM");
        bike.store("Velocity Viper");
        bike.store("Speed Sprinter");
        bike.store("Rapid Racer");
        bike.store("Pace Predator");
        bike.store("Speedy Streak");
        bike.store("Lightning Leader");

        bike.display();


    }}