package tight_coupling.paymentsystem;

public class PaymentProcessor {
    CreditCard card = new CreditCard(); // Tight coupling

    void process() {
        card.pay();
    }
}
