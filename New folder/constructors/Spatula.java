public class Spatula {
    String material = "Silicone";
    String brand = "OXO";
    double length = 12.5;
    String color = "Red";

    public static void main(String[] args) {
        Spatula spatula1 = new Spatula();

        // Print initial values
        System.out.println("Initial Spatula: " + spatula1.material + ", " + spatula1.brand + ", " + spatula1.length + " inches, " + spatula1.color);

        // Re-initialize and print values
        spatula1.material = "Stainless Steel";
        spatula1.brand = "KitchenAid";
        spatula1.length = 14.0;
        spatula1.color = "Black";
        System.out.println("Re-initialized Spatula: " + spatula1.material + ", " + spatula1.brand + ", " + spatula1.length + " inches, " + spatula1.color);
    }
}
