public class Kettle {
    double capacity;
    String material;
    String brand;
    int power;

    public static void main(String[] args) {
        Kettle kettle1 = new Kettle();
        kettle1.capacity = 1.5;
        kettle1.material = "Stainless Steel";
        kettle1.brand = "Philips";
        kettle1.power = 1500;

        Kettle kettle2 = new Kettle();
        kettle2.capacity = 2.0;
        kettle2.material = "Glass";
        kettle2.brand = "Breville";
        kettle2.power = 1800;

        Kettle kettle3 = new Kettle();
        kettle3.capacity = 1.2;
        kettle3.material = "Plastic";
        kettle3.brand = "Kenwood";
        kettle3.power = 1200;

        Kettle kettle4 = new Kettle();
        kettle4.capacity = 1.7;
        kettle4.material = "Ceramic";
        kettle4.brand = "Morphy Richards";
        kettle4.power = 2000;

        Kettle kettle5 = new Kettle();
        kettle5.capacity = 1.0;
        kettle5.material = "Stainless Steel";
        kettle5.brand = "Bosch";
        kettle5.power = 1000;

        Kettle kettle6 = new Kettle();
        kettle6.capacity = 1.8;
        kettle6.material = "Glass";
        kettle6.brand = "Hamilton Beach";
        kettle6.power = 1500;

        Kettle kettle7 = new Kettle();
        kettle7.capacity = 1.3;
        kettle7.material = "Plastic";
        kettle7.brand = "Prestige";
        kettle7.power = 1300;

        System.out.println("Kettle 1: " + kettle1.capacity + " liters, " + kettle1.material + ", " + kettle1.brand + ", " + kettle1.power + " watts");
        System.out.println("Kettle 2: " + kettle2.capacity + " liters, " + kettle2.material + ", " + kettle2.brand + ", " + kettle2.power + " watts");
        System.out.println("Kettle 3: " + kettle3.capacity + " liters, " + kettle3.material + ", " + kettle3.brand + ", " + kettle3.power + " watts");
        System.out.println("Kettle 4: " + kettle4.capacity + " liters, " + kettle4.material + ", " + kettle4.brand + ", " + kettle4.power + " watts");
        System.out.println("Kettle 5: " + kettle5.capacity + " liters, " + kettle5.material + ", " + kettle5.brand + ", " + kettle5.power + " watts");
        System.out.println("Kettle 6: " + kettle6.capacity + " liters, " + kettle6.material + ", " + kettle6.brand + ", " + kettle6.power + " watts");
        System.out.println("Kettle 7: " + kettle7.capacity + " liters, " + kettle7.material + ", " + kettle7.brand + ", " + kettle7.power + " watts");
    }
}
