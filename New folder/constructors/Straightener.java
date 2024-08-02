class Straightener {
    String brand;
    double price;
    int temperature; 
    String plateMaterial; 

   
    Straightener(int temperatureLocal, String plateMaterialLocal) {
        temperature = temperatureLocal;
        plateMaterial = plateMaterialLocal;
    }

    public static void main(String[] args) {
       
        Straightener straightener1 = new Straightener(230, "Ceramic");
        straightener1.brand = "GHD"; 

        
        double referencePrice1 = 149.99;
        straightener1.price = referencePrice1;

       
        Straightener straightener2 = new Straightener(210, "Titanium");
        straightener2.brand = "BaByliss"; 

        double referencePrice2 = 129.99;
        straightener2.price = referencePrice2; 

        
        System.out.println("Straightener 1 - Brand: " + straightener1.brand + ", Price: " + straightener1.price + ", Temperature: " + straightener1.temperature + "°C, Plate Material: " + straightener1.plateMaterial);
        System.out.println("Straightener 2 - Brand: " + straightener2.brand + ", Price: " + straightener2.price + ", Temperature: " + straightener2.temperature + "°C, Plate Material: " + straightener2.plateMaterial);
    }
}
