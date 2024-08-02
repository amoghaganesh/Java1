class Cable {
    String brand;
    double price;
    int length;
    String type;

    
    Cable(int lengthLocal, String typeLocal) {
        length = lengthLocal;
        type = typeLocal;
    }

    public static void main(String[] args) {
       
        Cable cable1 = new Cable(10, "HDMI");
        cable1.brand = "Belkin";

        
        double referencePrice1 = 25.00;
        cable1.price = referencePrice1;

      
        Cable cable2 = new Cable(5, "USB-C");
        cable2.brand = "Anker";
        double referencePrice2 = 15.00;
        cable2.price = referencePrice2;

       
        System.out.println("Cable 1 - Brand: " + cable1.brand + ", Price: " + cable1.price + ", Length: " + cable1.length + ", Type: " + cable1.type);
        System.out.println("Cable 2 - Brand: " + cable2.brand + ", Price: " + cable2.price + ", Length: " + cable2.length + ", Type: " + cable2.type);
    }
}
