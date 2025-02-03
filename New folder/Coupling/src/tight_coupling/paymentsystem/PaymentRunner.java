package tight_coupling.paymentsystem;

public class PaymentRunner {
    public static void main(String[] args) {
        PaymentProcessor pp = new PaymentProcessor();
        pp.process();
    }
}
