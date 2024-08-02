class Trumpet {
    String brand;
    double price;
    int valves;
    String finish;

    
    Trumpet(int valvesLocal, String finishLocal) {
        valves = valvesLocal;
        finish = finishLocal;
    }

    public static void main(String[] args) {
        
        Trumpet trumpet1 = new Trumpet(3, "Gold");
        trumpet1.brand = "Bach"; 

        
        double referencePrice1 = 999.99;
        trumpet1.price = referencePrice1;

      
        Trumpet trumpet2 = new Trumpet(3, "Silver");
        trumpet2.brand = "Yamaha"; 

        double referencePrice2 = 799.99;
        trumpet2.price = referencePrice2; 

      
        System.out.println("Trumpet 1 - Brand: " + trumpet1.brand + ", Price: " + trumpet1.price + ", Valves: " + trumpet1.valves + ", Finish: " + trumpet1.finish);
        System.out.println("Trumpet 2 - Brand: " + trumpet2.brand + ", Price: " + trumpet2.price + ", Valves: " + trumpet2.valves + ", Finish: " + trumpet2.finish);
    }
}
