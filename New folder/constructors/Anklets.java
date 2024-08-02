class Anklets {
    String brand;
    double price;
    String material; 
    String size; 

    
    Anklets(String materialLocal, String sizeLocal) {
        material = materialLocal;
        size = sizeLocal;
    }

    public static void main(String[] args) {
       
        Anklets anklet1 = new Anklets("Gold", "Medium");
        anklet1.brand = "Tanishq"; 

        
        double referencePrice1 = 299.99;
        anklet1.price = referencePrice1;

       
        Anklets anklet2 = new Anklets("Silver", "Small");
        anklet2.brand = "Kalyan"; 

        double referencePrice2 = 199.99;
        anklet2.price = referencePrice2; 

        
        System.out.println("Anklet 1 - Brand: " + anklet1.brand + ", Price: " + anklet1.price + ", Material: " + anklet1.material + ", Size: " + anklet1.size);
        System.out.println("Anklet 2 - Brand: " + anklet2.brand + ", Price: " + anklet2.price + ", Material: " + anklet2.material + ", Size: " + anklet2.size);
    }
}
