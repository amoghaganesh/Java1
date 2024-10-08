package com.xworkz.funinterfaace;

public class LabourRunner {
    public static void main(String[] args) {

        Labour labour = new Labour();


        FoodApp foodApp = (item, quantity) -> {
            System.out.println("this is "+item +"" +quantity);
        };

        labour.orderFood(foodApp);
    }



    }
