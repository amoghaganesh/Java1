package loose_coupling.vehiclesystem;

public class VehicleRunner {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Person person = new Person(car);
        person.travel();
    }
}
