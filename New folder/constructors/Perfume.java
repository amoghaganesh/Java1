class Perfume {
    String brand;
    double cost;
    double price;
    int quantity;

    // No parameter constructor
    public Perfume() {
        this.brand = "Unknown";
        this.cost = 0.0;
        this.price = 0.0;
        this.quantity = 0;
    }

    // Constructor to initialize brand and price
    public Perfume(String brand, double price) {
        this.brand = brand;
        this.price = price;
        this.cost = 0.0;
        this.quantity = 0;
    }

    // Constructor to initialize brand, price, and quantity
    public Perfume(String brand, double price, int quantity) {
        this.brand = brand;
        this.price = price;
        this.quantity = quantity;
        this.cost = 0.0;
    }

    // Constructor to initialize brand, price, quantity, and cost
    public Perfume(String brand, double price, int quantity, double cost) {
        this.brand = brand;
        this.price = price;
        this.quantity = quantity;
        this.cost = cost;
    }

    public void printDetails() {
        System.out.println("Perfume{brand='" + brand + "', cost=" + cost + ", price=" + price + ", quantity=" + quantity + "}");
    }

    public static void main(String[] args) {
        // Creating Perfume objects using different constructors
        Perfume perfume1 = new Perfume();
        Perfume perfume2 = new Perfume("Chanel", 100.00);
        Perfume perfume3 = new Perfume("Dior", 150.00, 50);
        Perfume perfume4 = new Perfume("Gucci", 200.00, 30, 180.00);

        // Printing Perfume objects
        perfume1.printDetails();
        perfume2.printDetails();
        perfume3.printDetails();
        perfume4.printDetails();
    }
}