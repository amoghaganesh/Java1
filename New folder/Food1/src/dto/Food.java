package dto;

public interface Food {
    // Abstract methods
    void prepareFood();
    void serveFood();
    void getMenu();
    double calculateBill(int quantity, double pricePerItem);

    // Static methods
    static void foodGuidelines() {
        System.out.println("Follow hygiene standards while preparing food.");
    }

    static void foodDeliveryOptions() {
        System.out.println("Available delivery options: Dine-in, Takeaway, Online Delivery.");
    }

    static void foodRatingSystem() {
        System.out.println("Rating system: 1-5 stars based on customer feedback.");
    }
}
