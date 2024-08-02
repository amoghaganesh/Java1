class Pendulum {
    String brand;
    double price;
    double length;
    String material;

    
    Pendulum(double lengthLocal, String materialLocal) {
        length = lengthLocal;
        material = materialLocal;
    }

    public static void main(String[] args) {
       
        Pendulum pendulum1 = new Pendulum(1.5, "Brass");
        pendulum1.brand = "Howard Miller"; 

        
        double referencePrice1 = 299.99;
        pendulum1.price = referencePrice1;

       
        Pendulum pendulum2 = new Pendulum(2.0, "Wood");
        pendulum2.brand = "Hermle"; 

        double referencePrice2 = 399.99;
        pendulum2.price = referencePrice2; 
		
        System.out.println("Pendulum 1 - Brand: " + pendulum1.brand + ", Price: " + pendulum1.price + ", Length: " + pendulum1.length + ", Material: " + pendulum1.material);
        System.out.println("Pendulum 2 - Brand: " + pendulum2.brand + ", Price: " + pendulum2.price + ", Length: " + pendulum2.length + ", Material: " + pendulum2.material);
    }
}
