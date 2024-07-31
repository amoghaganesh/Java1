public class Pillow {
    String material = "Memory Foam";
    String size = "Queen";
    String brand = "Tempur-Pedic";
    String color = "White";

    public static void main(String[] args) {
        Pillow pillow1 = new Pillow();

        // Print initial values
        System.out.println("Initial Pillow: " + pillow1.material + ", " + pillow1.size + ", " + pillow1.brand + ", " + pillow1.color);

        // Re-initialize and print values
        pillow1.material = "Down Feather";
        pillow1.size = "King";
        pillow1.brand = "Sealy";
        pillow1.color = "Blue";
        System.out.println("Re-initialized Pillow: " + pillow1.material + ", " + pillow1.size + ", " + pillow1.brand + ", " + pillow1.color);
    }
}
