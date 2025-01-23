public class VehicleRunner {
    public static void main(String[] args) {
        // Creating an object of the Car class
        Car myCar = new Car("Toyota", "Camry", 2022, 30000.00, "Blue");

        // Using static methods
        Vehicle.startEngine();
        Vehicle.maintenanceCheck();

        // Using instance methods
        myCar.displayDetails();
        myCar.drive();
        myCar.honk();

        // Using abstract method implementations
        myCar.accelerate();
        myCar.brake();
        myCar.openDoors();
        myCar.playMusic();
    }
}
