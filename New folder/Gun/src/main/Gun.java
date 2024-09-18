package gun;

public class Gun {
    String name="AK47";
    String country="India";
    String type="Advanced";

    public Gun()
    {

    }
    public void fire()
    {
        System.out.println("created main class with gun");
    }
    public void display()
    {
        System.out.println("The gun name is :"+name);
        System.out.println("The country of the gun :"+country);
        System.out.println("The gun type is :"+type);
    }
}