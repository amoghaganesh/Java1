class Mask {
    String brand;
    double price;
    String size; 
    String material; 

    
    Mask(String sizeLocal, String materialLocal) {
        size = sizeLocal;
        material = materialLocal;
    }

    public static void main(String[] args) {
        
        Mask mask1 = new Mask("Medium", "Cotton");
        mask1.brand = "3M"; 

      
        double referencePrice1 = 12.99;
        mask1.price = referencePrice1;

        
        Mask mask2 = new Mask("Large", "N95");
        mask2.brand = "Honeywell"; 

        double referencePrice2 = 25.99;
        mask2.price = referencePrice2; 

       
        System.out.println("Mask 1 - Brand: " + mask1.brand + ", Price: " + mask1.price + ", Size: " + mask1.size + ", Material: " + mask1.material);
        System.out.println("Mask 2 - Brand: " + mask2.brand + ", Price: " + mask2.price + ", Size: " + mask2.size + ", Material: " + mask2.material);
    }
}
