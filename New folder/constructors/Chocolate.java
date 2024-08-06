class Chocolate {
    public String brand;
    public double price;
    public String flavour;
    public String size;

    // No-parameter constructor
    public Chocolate() {
        this.brand = "Unknown";
        this.price = 0.0;
        this.flavour = "Unknown";
        this.size = "Unknown";
    }

    // Constructor to initialize brand
    public Chocolate(String brand) {
        this.brand = brand;
        this.price = 0.0;
        this.flavour = "Unknown";
        this.size = "Unknown";
    }

    // Constructor to initialize brand and price
    public Chocolate(String brand, double price) {
        this.brand = brand;
        this.price = price;
        this.flavour = "Unknown";
        this.size = "Unknown";
    }

    // Constructor to initialize all properties
    public Chocolate(String brand, double price, String flavour, String size) {
        this.brand = brand;
        this.price = price;
        this.flavour = flavour;
        this.size = size;
    }

    // Setter methods
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public void setSize(String size) {
        this.size = size;
    }

    // Method to display the values of the instance variables
    public void display() {
        System.out.println("Chocolate(brand: " + brand + ", price: " + price + ", flavour: " + flavour + ", size: " + size + ")");
    }

    public static void main(String[] args) {
        // Creating instances using different constructors
        Chocolate chocolateNoParam = new Chocolate();
        Chocolate chocolateWithBrand = new Chocolate("Cadbury");
        Chocolate chocolateWithBrandAndPrice = new Chocolate("Cadbury", 2.5);
        Chocolate chocolateWithAllProperties = new Chocolate("Cadbury", 2.5, "Milk", "Medium");

        // Setting properties using setter methods
        chocolateNoParam.setBrand("Nestle");
        chocolateNoParam.setPrice(3.0);
        chocolateNoParam.setFlavour("Dark");
        chocolateNoParam.setSize("Large");

        // Printing the variables after creating and setting
        chocolateNoParam.display();
        chocolateWithBrand.display();
        chocolateWithBrandAndPrice.display();
        chocolateWithAllProperties.display();
    }
}
