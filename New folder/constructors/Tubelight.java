public class Tubelight {
    int length;
    int wattage;
    String brand;
    int colorTemperature;

    public static void main(String[] args) {
        Tubelight tubelight1 = new Tubelight();
        tubelight1.length = 4;
        tubelight1.wattage = 40;
        tubelight1.brand = "Philips";
        tubelight1.colorTemperature = 6500;

        Tubelight tubelight2 = new Tubelight();
        tubelight2.length = 2;
        tubelight2.wattage = 20;
        tubelight2.brand = "GE";
        tubelight2.colorTemperature = 4000;

        Tubelight tubelight3 = new Tubelight();
        tubelight3.length = 3;
        tubelight3.wattage = 30;
        tubelight3.brand = "Osram";
        tubelight3.colorTemperature = 5000;

        Tubelight tubelight4 = new Tubelight();
        tubelight4.length = 4;
        tubelight4.wattage = 36;
        tubelight4.brand = "Havells";
        tubelight4.colorTemperature = 6000;

        Tubelight tubelight5 = new Tubelight();
        tubelight5.length = 5;
        tubelight5.wattage = 45;
        tubelight5.brand = "Syska";
        tubelight5.colorTemperature = 6500;

        Tubelight tubelight6 = new Tubelight();
        tubelight6.length = 3;
        tubelight6.wattage = 28;
        tubelight6.brand = "Bajaj";
        tubelight6.colorTemperature = 4500;

        Tubelight tubelight7 = new Tubelight();
        tubelight7.length = 6;
        tubelight7.wattage = 50;
        tubelight7.brand = "Wipro";
        tubelight7.colorTemperature = 7000;

        System.out.println("Tubelight 1: " + tubelight1.length + " feet, " + tubelight1.wattage + " watts, " + tubelight1.brand + ", " + tubelight1.colorTemperature + "K");
        System.out.println("Tubelight 2: " + tubelight2.length + " feet, " + tubelight2.wattage + " watts, " + tubelight2.brand + ", " + tubelight2.colorTemperature + "K");
        System.out.println("Tubelight 3: " + tubelight3.length + " feet, " + tubelight3.wattage + " watts, " + tubelight3.brand + ", " + tubelight3.colorTemperature + "K");
        System.out.println("Tubelight 4: " + tubelight4.length + " feet, " + tubelight4.wattage + " watts, " + tubelight4.brand + ", " + tubelight4.colorTemperature + "K");
        System.out.println("Tubelight 5: " + tubelight5.length + " feet, " + tubelight5.wattage + " watts, " + tubelight5.brand + ", " + tubelight5.colorTemperature + "K");
        System.out.println("Tubelight 6: " + tubelight6.length + " feet, " + tubelight6.wattage + " watts, " + tubelight6.brand + ", " + tubelight6.colorTemperature + "K");
        System.out.println("Tubelight 7: " + tubelight7.length + " feet, " + tubelight7.wattage + " watts, " + tubelight7.brand + ", " + tubelight7.colorTemperature + "K");
    }
}
