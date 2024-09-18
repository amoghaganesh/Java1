package Soldier;

import gun.Gun;

public class Soldier {


    public void use()
    {
        System.out.println("created with local type");
        Gun gun = new Gun();
        gun.fire();
        gun.display();
    }
}