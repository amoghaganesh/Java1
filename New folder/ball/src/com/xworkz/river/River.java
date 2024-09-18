package com.xworkz.river;

public class River {
    private String[] riverNames = new String[7];
    private int index;

    public void store(String Name)
    {
        this.riverNames[this.index] = Name;
        this.index++;
    }

    public void display()
    {
        for (String ref : riverNames)
        {
            System.out.println(ref);
        }
    }

    public static void main(String[] args)
    {
        River river = new River();
        river.store("Kaveri");
        river.store("Tungabhadra");
        river.store("Malaprabha");
        river.store("Arkavati");
        river.store("Netravati");
        river.store("Hemavathi");
        river.store("Krishna");

        river.display();
    }
}