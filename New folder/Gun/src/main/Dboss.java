package Dboss;

import gun.Gun;

public class Dboss {

    public Gun gun;

    public void mass()
    {
        System.out.println("created with instance type");
        Gun gun = new Gun();
        gun.fire();
        gun.display();
    }
}