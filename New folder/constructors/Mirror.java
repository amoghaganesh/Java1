public class Mirror {
    String shape = "Round";
    double diameter = 24.0;
    String frameMaterial = "Wood";
    String color = "Brown";

    public static void main(String[] args) {
        Mirror mirror1 = new Mirror();

        // Print initial values
        System.out.println("Initial Mirror: " + mirror1.shape + ", " + mirror1.diameter + " inches, " + mirror1.frameMaterial + ", " + mirror1.color);

        // Re-initialize and print values
        mirror1.shape = "Square";
        mirror1.diameter = 30.0;
        mirror1.frameMaterial = "Metal";
        mirror1.color = "Black";
        System.out.println("Re-initialized Mirror: " + mirror1.shape + ", " + mirror1.diameter + " inches, " + mirror1.frameMaterial + ", " + mirror1.color);
    }
}
