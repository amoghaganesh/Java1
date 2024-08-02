class Syringe {
    String brand;
    double price;
    int capacity; 
    String type; 

   
    Syringe(int capacityLocal, String typeLocal) {
        capacity = capacityLocal;
        type = typeLocal;
    }

    public static void main(String[] args) {
       
        Syringe syringe1 = new Syringe(10, "Disposable");
        syringe1.brand = "BD"; 

     
        double referencePrice1 = 5.99;
        syringe1.price = referencePrice1;

      
        Syringe syringe2 = new Syringe(20, "Reusable");
        syringe2.brand = "Terumo";

        double referencePrice2 = 8.99;
        syringe2.price = referencePrice2;
		
        System.out.println("Syringe 1 - Brand: " + syringe1.brand + ", Price: " + syringe1.price + ", Capacity: " + syringe1.capacity + " ml, Type: " + syringe1.type);
        System.out.println("Syringe 2 - Brand: " + syringe2.brand + ", Price: " + syringe2.price + ", Capacity: " + syringe2.capacity + " ml, Type: " + syringe2.type);
    }
}
