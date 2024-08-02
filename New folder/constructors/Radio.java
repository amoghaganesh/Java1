class Radio {
    String model;
    double price;
    double frequency;
    String color;

    
    Radio(double frequencyLocal, String colorLocal) {
        frequency = frequencyLocal;
        color = colorLocal;
    }

    public static void main(String[] args) {
       
        Radio radio1 = new Radio(99.5, "Black");
        radio1.model = "Sony"; 

       
        double referencePrice1 = 59.99;
        radio1.price = referencePrice1;

        // Create another instance of Radio
        Radio radio2 = new Radio(101.1, "Silver");
        radio2.model = "Panasonic"; 

        double referencePrice2 = 89.99;
        radio2.price = referencePrice2; 

       
        System.out.println("Radio 1 - Model: " + radio1.model + ", Price: " + radio1.price + ", Frequency: " + radio1.frequency + ", Color: " + radio1.color);
        System.out.println("Radio 2 - Model: " + radio2.model + ", Price: " + radio2.price + ", Frequency: " + radio2.frequency + ", Color: " + radio2.color);
    }
}
