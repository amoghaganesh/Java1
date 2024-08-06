class Metal {
    String name;
    double cost;

    // No parameter constructor
    public Metal() {
        this.name = "Unknown";
        this.cost = 0.0;
    }

    // Constructor to initialize name
    public Metal(String name) {
        this.name = name;
        this.cost = 0.0;
    }

    // Constructor to initialize cost
    public Metal(double cost) {
        this.name = "Unknown";
        this.cost = cost;
    }

    // Constructor to initialize name and cost
    public Metal(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public void printDetails() {
        System.out.println("Metal{name='" + name + "', cost=" + cost + "}");
    }

    public static void main(String[] args) {
        // Creating Metal objects using different constructors
        Metal metal1 = new Metal();
        Metal metal2 = new Metal("Iron");
        Metal metal3 = new Metal(200.50);
        Metal metal4 = new Metal("Copper", 350.75);

        // Printing Metal objects
        metal1.printDetails();
        metal2.printDetails();
        metal3.printDetails();
        metal4.printDetails();
    }
}