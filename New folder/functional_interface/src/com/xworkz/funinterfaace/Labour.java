package com.xworkz.funinterfaace;

public class Labour {

    public void orderFood(FoodApp foodapp) {
        if (foodapp != null) {
            System.out.println("orderFood is not null");
            foodapp.order("idli", 5);
        } else {
            System.out.println("order food is null");
        }

    }}
