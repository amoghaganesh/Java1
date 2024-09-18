package pizza;

public class Harsha {

    public Pizza pizza;
    public void eat(){
        System.out.println("eat in harsha");
        if (pizza!=null){
            pizza.fillStomach();
        }
        else{
            System.out.println("eat in harsha is null");
        }
    }
}
