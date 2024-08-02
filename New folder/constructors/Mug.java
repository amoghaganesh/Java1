class Mug {
    String brand;
    double price;
    int capacity; 
    String color;

    
    Mug(int capacityLocal, String colorLocal) {
        capacity = capacityLocal;
        color = colorLocal;
    }

    public static void main(String[] args) {
        
        Mug mug1 = new Mug(350, "Blue");
        mug1.brand = "Contigo"; 

        double referencePrice1 = 19.99;
        mug1.price = referencePrice1;

       
        Mug mug2 = new Mug(400, "Red");
        mug2.brand = "Thermos"; 

        double referencePrice2 = 22.99;
        mug2.price = referencePrice2; 

   
        System.out.println("Mug 1 - Brand: " + mug1.brand + ", Price: " + mug1.price + ", Capacity: " + mug1.capacity + " ml, Color: " + mug1.color);
        System.out.println("Mug 2 - Brand: " + mug2.brand + ", Price: " + mug2.price + ", Capacity: " + mug2.capacity + " ml, Color: " + mug2.color);
    }
}
