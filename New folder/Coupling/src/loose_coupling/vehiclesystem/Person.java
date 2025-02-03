package loose_coupling.vehiclesystem;

public class Person {
    private Vehicle vehicle;

    Person(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    void travel() {
        vehicle.drive();
    }
}
