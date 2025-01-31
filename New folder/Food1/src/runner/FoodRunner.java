package runner;

import service.FoodService;
import service.Hotel;
import service.Restaurant;
import service.FoodStreet;

public class FoodRunner {
    public static void main(String[] args) {
        // Creating instances
        FoodService hotel = new Hotel();
        FoodService restaurant = new Restaurant();
        FoodService foodStreet = new FoodStreet();

        // Invoking methods for Hotel
        System.out.println("----- Hotel Service -----");
        hotel.prepareFood();
        hotel.serveFood();
        hotel.getMenu();
        System.out.println("Bill Amount: $" + hotel.calculateBill(2, 20.5));
        hotel.displayFoodDetails();

        // Invoking methods for Restaurant
        System.out.println("\n----- Restaurant Service -----");
        restaurant.prepareFood();
        restaurant.serveFood();
        restaurant.getMenu();
        System.out.println("Bill Amount: $" + restaurant.calculateBill(3, 10.0));
        restaurant.displayFoodDetails();

        // Invoking methods for Food Street
        System.out.println("\n----- Food Street Service -----");
        foodStreet.prepareFood();
        foodStreet.serveFood();
        foodStreet.getMenu();
        System.out.println("Bill Amount: $" + foodStreet.calculateBill(5, 5.5));
        foodStreet.displayFoodDetails();

        // Invoking static methods
        System.out.println("\n----- Food Static Methods -----");
        dto.Food.foodGuidelines();
        dto.Food.foodDeliveryOptions();
        dto.Food.foodRatingSystem();
    }
}
