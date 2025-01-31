package service;


public class Hotel implements FoodService {
    @Override
    public void prepareFood() {
        System.out.println("Hotel is preparing gourmet dishes.");
    }

    @Override
    public void serveFood() {
        System.out.println("Hotel serves food in a fine dining environment.");
    }

    @Override
    public void getMenu() {
        System.out.println("Hotel Menu: Multi-cuisine, Buffet, and Speciality Dishes.");
    }

    @Override
    public double calculateBill(int quantity, double pricePerItem) {
        return quantity * pricePerItem;
    }

    @Override
    public void displayFoodDetails() {
        System.out.println("Hotel serves luxurious meals with premium quality.");
    }
}