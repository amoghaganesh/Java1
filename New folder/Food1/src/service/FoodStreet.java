package service;



public class FoodStreet implements FoodService {
    @Override
    public void prepareFood() {
        System.out.println("Food Street vendors prepare quick and delicious street food.");
    }

    @Override
    public void serveFood() {
        System.out.println("Food Street serves food in an open and vibrant atmosphere.");
    }

    @Override
    public void getMenu() {
        System.out.println("Food Street Menu: Local Snacks, Fast Food, and Street Specialties.");
    }

    @Override
    public double calculateBill(int quantity, double pricePerItem) {
        return quantity * pricePerItem;
    }

    @Override
    public void displayFoodDetails() {
        System.out.println("Food Street provides affordable and tasty local food.");
    }
}
