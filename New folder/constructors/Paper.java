class Paper {
    public double thickness;
    public String size;
    public String quality;
    public String color;

    // No-parameter constructor
    public Paper() {
        this.thickness = 0.0;
        this.size = "Unknown";
        this.quality = "Unknown";
        this.color = "Unknown";
    }

    // Constructor to initialize thickness
    public Paper(double thickness) {
        this.thickness = thickness;
        this.size = "Unknown";
        this.quality = "Unknown";
        this.color = "Unknown";
    }

    // Constructor to initialize thickness and size
    public Paper(double thickness, String size) {
        this.thickness = thickness;
        this.size = size;
        this.quality = "Unknown";
        this.color = "Unknown";
    }

    // Constructor to initialize all properties
    public Paper(double thickness, String size, String quality, String color) {
        this.thickness = thickness;
        this.size = size;
        this.quality = quality;
        this.color = color;
    }

    // Setter methods
    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Method to display the values of the instance variables
    public void display() {
        System.out.println("Paper(thickness: " + thickness + ", size: " + size + ", quality: " + quality + ", color: " + color + ")");
    }

    public static void main(String[] args) {
        // Creating instances using different constructors
        Paper paperNoParam = new Paper();
        Paper paperWithThickness = new Paper(0.1);
        Paper paperWithThicknessAndSize = new Paper(0.1, "A4");
        Paper paperWithAllProperties = new Paper(0.1, "A4", "High", "White");

        // Setting properties using setter methods
        paperNoParam.setThickness(0.2);
        paperNoParam.setSize("A3");
        paperNoParam.setQuality("Premium");
        paperNoParam.setColor("Blue");

        // Printing the variables after creating and setting
        paperNoParam.display();
        paperWithThickness.display();
        paperWithThicknessAndSize.display();
        paperWithAllProperties.display();
    }
}
