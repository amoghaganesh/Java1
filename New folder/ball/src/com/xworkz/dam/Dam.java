package com.xworkz.dam;

public class Dam {
    private String[] damNames = new String[7];
    private int index;

    public void store(String Name)
    {
        this.damNames[this.index] = Name;
        this.index++;
    }

    public void display()
    {
        for (String ref : damNames)
        {
            System.out.println(ref);
        }
    }

    public static void main(String[] args)
    {
        Dam dam = new Dam();
        dam.store("Alamatti");
        dam.store("Basava Sagar");
        dam.store("Badra");
        dam.store("Supa");
        dam.store("Renuka Sagar");
        dam.store("Tungabhadra");
        dam.store("Kodasalli");

        dam.display();
    }
}