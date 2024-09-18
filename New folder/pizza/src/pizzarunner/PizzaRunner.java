package pizzarunner;

import pizza.*;

public class PizzaRunner {

    public static void main(String[] args) {

        System.out.println("Aishwaraya eating pizza");
        Aishwaraya aishwaraya=new Aishwaraya();
        Aishwaraya.eating();
        System.out.println("===============");

       Pradeep pradeep=new Pradeep();
        Pizza ref=pradeep.deliver();
    if(ref!=null){

        System.out.println(ref.name);
        System.out.println(ref.cost);
        ref.fillStomach();
    }
    else{
        System.out.println("pizza in pradeep is null");
    }
        System.out.println("----------------");


}


    }
