class Harmonica {
    String brand;
    double price;
    String key;
    String type;

    
    Harmonica(String keyLocal, String typeLocal) {
        key = keyLocal;
        type = typeLocal;
    }

    public static void main(String[] args) {
       
        Harmonica harmonica1 = new Harmonica("C", "Diatonic");
        harmonica1.brand = "Hohner"; 

        
        double referencePrice1 = 45.99;
        harmonica1.price = referencePrice1;

       
        Harmonica harmonica2 = new Harmonica("G", "Chromatic");
        harmonica2.brand = "Lee Oskar";

        double referencePrice2 = 65.99;
        harmonica2.price = referencePrice2; 

       
        System.out.println("Harmonica 1 - Brand: " + harmonica1.brand + ", Price: " + harmonica1.price + ", Key: " + harmonica1.key + ", Type: " + harmonica1.type);
        System.out.println("Harmonica 2 - Brand: " + harmonica2.brand + ", Price: " + harmonica2.price + ", Key: " + harmonica2.key + ", Type: " + harmonica2.type);
    }
}
