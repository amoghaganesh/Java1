package com.xworkz.dancer;

import com.xworkz.belt.Belt;
import com.xworkz.leatherbelt.LeatherBelt;

public class Dancer {

    public void use(Belt belt){

        System.out.println("use dancer");
        belt.tie();

        if (belt instanceof LeatherBelt){
            System.out.println("instace of leatherbelt");
            LeatherBelt leatherBelt=(LeatherBelt) belt;
            leatherBelt.clip();

        }


    }
}
