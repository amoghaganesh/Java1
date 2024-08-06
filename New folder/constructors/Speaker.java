class Speaker {
    public String brand;
    public String size;
    public double cost;
    public int output;

    // No-parameter constructor
    public Speaker() {
        this.brand = "Unknown";
        this.size = "Unknown";
        this.cost = 0.0;
        this.output = 0;
    }

    // Constructor to initialize brand
    public Speaker(String brand) {
        this.brand = brand;
        this.size = "Unknown";
        this.cost = 0.0;
        this.output = 0;
    }

    // Constructor to initialize brand and size
    public Speaker(String brand, String size) {
        this.brand = brand;
        this.size = size;
        this.cost = 0.0;
        this.output = 0;
    }

    // Constructor to initialize all properties
    public Speaker(String brand, String size, double cost, int output) {
        this.brand = brand;
        this.size = size;
        this.cost = cost;
        this.output = output;
    }

    // Setter methods
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setOutput(int output) {
        this.output = output;
    }

    // Method to display the values of the instance variables
    public void display() {
        System.out.println("Speaker(brand: " + brand + ", size: " + size + ", cost: " + cost + ", output: " + output + ")");
    }

    public static void main(String[] args) {
        // Creating instances using different constructors
        Speaker speakerNoParam = new Speaker();
        Speaker speakerWithBrand = new Speaker("Sony");
        Speaker speakerWithBrandAndSize = new Speaker("Sony", "Large");
        Speaker speakerWithAllProperties = new Speaker("Sony", "Large", 150.0, 100);

        // Setting properties using setter methods
        speakerNoParam.setBrand("Bose");
        speakerNoParam.setSize("Medium");
        speakerNoParam.setCost(200.0);
        speakerNoParam.setOutput(80);

        // Printing the variables after creating and setting
        speakerNoParam.display();
        speakerWithBrand.display();
        speakerWithBrandAndSize.display();
        speakerWithAllProperties.display();
    }
}
