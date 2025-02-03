package loose_coupling.foodorderingsystem;

public class Restaurant {
    private Food food;

    Restaurant(Food food) {
        this.food = food;
    }

    void orderFood() {
        food.prepare();
    }
}
