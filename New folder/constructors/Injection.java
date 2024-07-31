public class Injection {
    String name;
    String typeOfInjection;
    double volume;
    String manufacturer;

    public static void main(String[] args) {
        Injection injection1 = new Injection();
        injection1.name = "Insulin";
        injection1.typeOfInjection = "Subcutaneous";
        injection1.volume = 1.0;
        injection1.manufacturer = "Novo Nordisk";

        Injection injection2 = new Injection();
        injection2.name = "Adrenaline";
        injection2.typeOfInjection = "Intramuscular";
        injection2.volume = 0.5;
        injection2.manufacturer = "Pfizer";

        Injection injection3 = new Injection();
        injection3.name = "Ceftriaxone";
        injection3.typeOfInjection = "Intravenous";
        injection3.volume = 2.0;
        injection3.manufacturer = "Roche";

        Injection injection4 = new Injection();
        injection4.name = "Vitamin B12";
        injection4.typeOfInjection = "Intramuscular";
        injection4.volume = 1.0;
        injection4.manufacturer = "Merck";

        Injection injection5 = new Injection();
        injection5.name = "Morphine";
        injection5.typeOfInjection = "Intravenous";
        injection5.volume = 1.0;
        injection5.manufacturer = "Purdue Pharma";

        Injection injection6 = new Injection();
        injection6.name = "Heparin";
        injection6.typeOfInjection = "Subcutaneous";
        injection6.volume = 0.2;
        injection6.manufacturer = "Sanofi";

        Injection injection7 = new Injection();
        injection7.name = "Lidocaine";
        injection7.typeOfInjection = "Intravenous";
        injection7.volume = 1.0;
        injection7.manufacturer = "Baxter";

        System.out.println("Injection 1: " + injection1.name + ", " + injection1.typeOfInjection + ", " + injection1.volume + " ml, " + injection1.manufacturer);
        System.out.println("Injection 2: " + injection2.name + ", " + injection2.typeOfInjection + ", " + injection2.volume + " ml, " + injection2.manufacturer);
        System.out.println("Injection 3: " + injection3.name + ", " + injection3.typeOfInjection + ", " + injection3.volume + " ml, " + injection3.manufacturer);
        System.out.println("Injection 4: " + injection4.name + ", " + injection4.typeOfInjection + ", " + injection4.volume + " ml, " + injection4.manufacturer);
        System.out.println("Injection 5: " + injection5.name + ", " + injection5.typeOfInjection + ", " + injection5.volume + " ml, " + injection5.manufacturer);
        System.out.println("Injection 6: " + injection6.name + ", " + injection6.typeOfInjection + ", " + injection6.volume + " ml, " + injection6.manufacturer);
        System.out.println("Injection 7: " + injection7.name + ", " + injection7.typeOfInjection + ", " + injection7.volume + " ml, " + injection7.manufacturer);
    }
}
