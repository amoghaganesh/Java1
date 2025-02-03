package loose_coupling.lightswitch;

public class LightRunner {
    public static void main(String[] args) {
        Device light = new Light();
        Switch s = new Switch(light);
        s.press();
    }
}
