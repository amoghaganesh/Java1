package tight_coupling.vehiclesystem;

public class Person {
    Car car = new Car(); // Tight coupling

    void travel() {
        car.drive();

    }

}