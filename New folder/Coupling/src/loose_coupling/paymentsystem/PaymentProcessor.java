package loose_coupling.paymentsystem;

public class PaymentProcessor {
    private PaymentMethod method;

    PaymentProcessor(PaymentMethod method) {
        this.method = method;
    }

    void process() {
        method.pay();
    }
}
