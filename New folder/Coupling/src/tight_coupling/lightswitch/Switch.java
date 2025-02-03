package tight_coupling.lightswitch;

public class Switch {
    Light light = new Light(); // Tight coupling

    void press() {
        light.turnOn();
    }
}
