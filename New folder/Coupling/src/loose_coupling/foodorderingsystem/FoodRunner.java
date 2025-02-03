package loose_coupling.foodorderingsystem;

public class FoodRunner {
    public static void main(String[] args) {
        Food food = new Burger();
        Restaurant restaurant = new Restaurant(food);
        restaurant.orderFood();
    }
}
