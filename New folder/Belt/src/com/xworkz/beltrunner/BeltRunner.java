package com.xworkz.beltrunner;

import com.xworkz.belt.Belt;
import com.xworkz.dancer.Dancer;
import com.xworkz.leatherbelt.LeatherBelt;

public class BeltRunner {
    public static void main(String[] args) {


        Belt belt=new Belt();
        Dancer dancer=new Dancer();
        LeatherBelt leatherBelt=new LeatherBelt();

        dancer.use(belt);
        System.out.println("--------------------");
        dancer.use(leatherBelt);
    }


}
