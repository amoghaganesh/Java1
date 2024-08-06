class Projector {
    public String company;
    public String type;
    public String color;
    public double weight;

    // No-parameter constructor
    public Projector() {
        this.company = "Unknown";
        this.type = "Unknown";
        this.color = "Unknown";
        this.weight = 0.0;
    }

    // Constructor to initialize company
    public Projector(String company) {
        this.company = company;
        this.type = "Unknown";
        this.color = "Unknown";
        this.weight = 0.0;
    }

    // Constructor to initialize company and type
    public Projector(String company, String type) {
        this.company = company;
        this.type = type;
        this.color = "Unknown";
        this.weight = 0.0;
    }

    // Constructor to initialize all properties
    public Projector(String company, String type, String color, double weight) {
        this.company = company;
        this.type = type;
        this.color = color;
        this.weight = weight;
    }

    // Setter methods
    public void setCompany(String company) {
        this.company = company;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Method to display the values of the instance variables
    public void display() {
        System.out.println("Projector(company: " + company + ", type: " + type + ", color: " + color + ", weight: " + weight + ")");
    }

    public static void main(String[] args) {
        // Creating instances using different constructors
        Projector projectorNoParam = new Projector();
        Projector projectorWithCompany = new Projector("Epson");
        Projector projectorWithCompanyAndType = new Projector("Epson", "LED");
        Projector projectorWithAllProperties = new Projector("Epson", "LED", "White", 2.5);

        // Setting properties using setter methods
        projectorNoParam.setCompany("Sony");
        projectorNoParam.setType("DLP");
        projectorNoParam.setColor("Black");
        projectorNoParam.setWeight(3.0);

        // Printing the variables after creating and setting
        projectorNoParam.display();
        projectorWithCompany.display();
        projectorWithCompanyAndType.display();
        projectorWithAllProperties.display();
    }
}
