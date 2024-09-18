package pizza;

public class Saqib {

    public static void order() {

    }

    public  void order(Pizza pizza){

        System.out.println("order in saqib");
        if(pizza!=null){

            System.out.println(pizza.name);
            System.out.println(pizza.cost);
            Pizza.fillstomach();
        }
    }

}
