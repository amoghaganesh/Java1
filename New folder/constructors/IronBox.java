public class IronBox {
    String brand = "Philips";
    int power = 1500;
    String color = "White";
    double weight = 1.5;

    public static void main(String[] args) {
        IronBox ironBox1 = new IronBox();

        // Print initial values
        System.out.println("Initial IronBox: " + ironBox1.brand + ", " + ironBox1.power + " watts, " + ironBox1.color + ", " + ironBox1.weight + " kg");

        // Re-initialize and print values
        ironBox1.brand = "Bajaj";
        ironBox1.power = 1800;
        ironBox1.color = "Blue";
        ironBox1.weight = 1.8;
        System.out.println("Re-initialized IronBox: " + ironBox1.brand + ", " + ironBox1.power + " watts, " + ironBox1.color + ", " + ironBox1.weight + " kg");
    }
}
