package com.xworkz.runner;

import Soldier.Soldier;
import Dboss.Dboss;
import godse.Godse;
import gun.Gun;
import police.Police;

    public class Runner {

        public static void main(String[] args) {

            Soldier soldier=new Soldier();
            soldier.use();
            System.out.println("============================");
            Police police=new Police();
            Gun gun=new Gun();
            police.details(gun);
            System.out.println("============================");
            Dboss dboss=new Dboss();
            dboss.mass();
            System.out.println("============================");
            Godse godse=new Godse();
            godse.range();
        }
    }

