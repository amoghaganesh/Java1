class CoffeePowder {
    double cost;
    String company;
    double weight;
    String manfDate;

    // No parameter constructor
    public CoffeePowder() {
        this.company = "Unknown";
        this.cost = 0.0;
        this.weight = 0.0;
        this.manfDate = "Unknown";
    }

    // Constructor to initialize company
    public CoffeePowder(String company) {
        this.company = company;
        this.cost = 0.0;
        this.weight = 0.0;
        this.manfDate = "Unknown";
    }

    // Constructor to initialize company, cost, weight, and manfDate
    public CoffeePowder(String company, double cost, double weight, String manfDate) {
        this.company = company;
        this.cost = cost;
        this.weight = weight;
        this.manfDate = manfDate;
    }

    // Constructor to initialize company and manfDate
    public CoffeePowder(String company, String manfDate) {
        this.company = company;
        this.cost = 0.0;
        this.weight = 0.0;
        this.manfDate = manfDate;
    }

    // Constructor to initialize weight
    public CoffeePowder(double weight) {
        this.company = "Unknown";
        this.cost = 0.0;
        this.weight = weight;
        this.manfDate = "Unknown";
    }

    public void printDetails() {
        System.out.println("CoffeePowder{cost=" + cost + ", company='" + company + "', weight=" + weight + ", manfDate='" + manfDate + "'}");
    }

    public static void main(String[] args) {
        // Creating CoffeePowder objects using different constructors
        CoffeePowder coffee1 = new CoffeePowder();
        CoffeePowder coffee2 = new CoffeePowder("Nescafe");
        CoffeePowder coffee3 = new CoffeePowder("Bru", 300.00, 1.5, "2023-01-01");
        CoffeePowder coffee4 = new CoffeePowder("Tata", "2022-05-20");
        CoffeePowder coffee5 = new CoffeePowder(2.0);

        // Printing CoffeePowder objects
        coffee1.printDetails();
        coffee2.printDetails();
        coffee3.printDetails();
        coffee4.printDetails();
        coffee5.printDetails();
    }
}