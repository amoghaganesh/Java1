public class Wallet {
    String material = "Leather";
    String brand = "Fossil";
    String color = "Brown";
    int numberOfCardSlots = 8;

    public static void main(String[] args) {
        Wallet wallet1 = new Wallet();

        // Print initial values
        System.out.println("Initial Wallet: " + wallet1.material + ", " + wallet1.brand + ", " + wallet1.color + ", " + wallet1.numberOfCardSlots + " card slots");

        // Re-initialize and print values
        wallet1.material = "Canvas";
        wallet1.brand = "Herschel";
        wallet1.color = "Black";
        wallet1.numberOfCardSlots = 10;
        System.out.println("Re-initialized Wallet: " + wallet1.material + ", " + wallet1.brand + ", " + wallet1.color + ", " + wallet1.numberOfCardSlots + " card slots");
    }
}
