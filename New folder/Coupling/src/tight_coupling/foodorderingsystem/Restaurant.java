package tight_coupling.foodorderingsystem;

public class Restaurant {
    Burger burger = new Burger(); // Tight coupling

    void orderFood() {
        burger.prepare();
    }
}
