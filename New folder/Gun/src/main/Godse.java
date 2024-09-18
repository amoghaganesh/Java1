package godse;

import gun.Gun;

public class Godse {

    public Gun range()
    {
        System.out.println("created with return type");
        Gun gun=new Gun();
        gun.fire();
        gun.display();
        return gun;
    }
}