public class MusicalInstrument {
    String name;
    String typeOfInstrument;
    String brand;
    double price;

    public static void main(String[] args) {
        MusicalInstrument instrument1 = new MusicalInstrument();
        instrument1.name = "Guitar";
        instrument1.typeOfInstrument = "String";
        instrument1.brand = "Fender";
        instrument1.price = 1200.0;

        MusicalInstrument instrument2 = new MusicalInstrument();
        instrument2.name = "Piano";
        instrument2.typeOfInstrument = "Keyboard";
        instrument2.brand = "Yamaha";
        instrument2.price = 3000.0;

        MusicalInstrument instrument3 = new MusicalInstrument();
        instrument3.name = "Violin";
        instrument3.typeOfInstrument = "String";
        instrument3.brand = "Stradivarius";
        instrument3.price = 15000.0;

        MusicalInstrument instrument4 = new MusicalInstrument();
        instrument4.name = "Flute";
        instrument4.typeOfInstrument = "Wind";
        instrument4.brand = "Yamaha";
        instrument4.price = 300.0;

        MusicalInstrument instrument5 = new MusicalInstrument();
        instrument5.name = "Drum";
        instrument5.typeOfInstrument = "Percussion";
        instrument5.brand = "Tama";
        instrument5.price = 800.0;

        MusicalInstrument instrument6 = new MusicalInstrument();
        instrument6.name = "Saxophone";
        instrument6.typeOfInstrument = "Wind";
        instrument6.brand = "Selmer";
        instrument6.price = 2500.0;

        MusicalInstrument instrument7 = new MusicalInstrument();
        instrument7.name = "Trumpet";
        instrument7.typeOfInstrument = "Brass";
        instrument7.brand = "Bach";
        instrument7.price = 1500.0;

        System.out.println("Instrument 1: " + instrument1.name + ", " + instrument1.typeOfInstrument + ", " + instrument1.brand + ", $" + instrument1.price);
        System.out.println("Instrument 2: " + instrument2.name + ", " + instrument2.typeOfInstrument + ", " + instrument2.brand + ", $" + instrument2.price);
        System.out.println("Instrument 3: " + instrument3.name + ", " + instrument3.typeOfInstrument + ", " + instrument3.brand + ", $" + instrument3.price);
        System.out.println("Instrument 4: " + instrument4.name + ", " + instrument4.typeOfInstrument + ", " + instrument4.brand + ", $" + instrument4.price);
        System.out.println("Instrument 5: " + instrument5.name + ", " + instrument5.typeOfInstrument + ", " + instrument5.brand + ", $" + instrument5.price);
        System.out.println("Instrument 6: " + instrument6.name + ", " + instrument6.typeOfInstrument + ", " + instrument6.brand + ", $" + instrument6.price);
        System.out.println("Instrument 7: " + instrument7.name + ", " + instrument7.typeOfInstrument + ", " + instrument7.brand + ", $" + instrument7.price);
    }
}
