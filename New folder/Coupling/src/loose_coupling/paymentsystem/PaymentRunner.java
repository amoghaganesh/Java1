package loose_coupling.paymentsystem;

public class PaymentRunner {
    public static void main(String[] args) {
        PaymentMethod method = new CreditCard();
        PaymentProcessor pp = new PaymentProcessor(method);
        pp.process();
    }
}
