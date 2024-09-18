package com.xworkz.Plant;

public class Plant {

    String type;
    String name;
    int height;
    int age;
    String color;
    String climate;
    String soilType;
    boolean flowering;
    int waterRequirements;
    String sunlightExposure;

    // Constructor initializing 5 variables
    public Plant(String name, String type, int height, int age, String color) {
        this.name = name;
        this.type = type;
        this.height = height;
        this.age = age;
        this.color = color;
    }

    // Methods to set the other 5 variables
    public void setClimate(String climate) {
        this.climate = climate;
    }

    public void setSoilType(String soilType) {
        this.soilType = soilType;
    }

    public void setFlowering(boolean flowering) {
        this.flowering = flowering;
    }

    public void setWaterRequirements(int waterRequirements) {
        this.waterRequirements = waterRequirements;
    }

    public void setSunlightExposure(String sunlightExposure) {
        this.sunlightExposure = sunlightExposure;
    }

    // Method to print the variables
    public void printDetails() {
        System.out.println("Plant: " + name + ", Type: " + type + ", Height: " + height + " cm, Age: " + age + " years, Color: " + color +
                ", Climate: " + climate + ", Soil Type: " + soilType + ", Flowering: " + flowering +
                ", Water Requirements: " + waterRequirements + " ml/day, Sunlight Exposure: " + sunlightExposure);
    }
}


