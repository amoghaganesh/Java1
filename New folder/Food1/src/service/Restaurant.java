package service;



public class Restaurant implements FoodService {
    @Override
    public void prepareFood() {
        System.out.println("Restaurant is preparing casual dining meals.");
    }

    @Override
    public void serveFood() {
        System.out.println("Restaurant serves food in a family-friendly setting.");
    }

    @Override
    public void getMenu() {
        System.out.println("Restaurant Menu: Fast food, Beverages, and Family Meals.");
    }

    @Override
    public double calculateBill(int quantity, double pricePerItem) {
        return quantity * pricePerItem;
    }

    @Override
    public void displayFoodDetails() {
        System.out.println("Restaurant offers quality food at an affordable price.");
    }
}
