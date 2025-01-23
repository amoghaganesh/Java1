
    abstract class Vehicle {

        String brand;
        String model;
        int year;
        double price;
        String color;


        public Vehicle(String brand, String model, int year, double price, String color) {
            this.brand = brand;
            this.model = model;
            this.year = year;
            this.price = price;
            this.color = color;
        }


        public static void startEngine() {
            System.out.println("Engine started.");
        }

        public static void stopEngine() {
            System.out.println("Engine stopped.");
        }

        public static void fuelUp() {
            System.out.println("Fueling up the vehicle.");
        }

        public static void maintenanceCheck() {
            System.out.println("Performing maintenance check.");
        }

        // Instance methods
        public void drive() {
            System.out.println("Driving the vehicle.");
        }

        public void park() {
            System.out.println("Parking the vehicle.");
        }

        public void honk() {
            System.out.println("Honking the horn.");
        }

        public void displayDetails() {
            System.out.println("Vehicle Details:");
            System.out.println("Brand: " + brand);
            System.out.println("Model: " + model);
            System.out.println("Year: " + year);
            System.out.println("Price: $" + price);
            System.out.println("Color: " + color);
        }


        public abstract void accelerate();

        public abstract void brake();

        public abstract void openDoors();

        public abstract void playMusic();
    }


    class Car extends Vehicle {

        // Constructor for Car class
        public Car(String brand, String model, int year, double price, String color) {
            super(brand, model, year, price, color);
        }


        @Override
        public void accelerate() {
            System.out.println("Car is accelerating.");
        }

        @Override
        public void brake() {
            System.out.println("Car is braking.");
        }

        @Override
        public void openDoors() {
            System.out.println("Car doors are opening.");
        }

        @Override
        public void playMusic() {
            System.out.println("Playing music in the car.");
        }
    }


