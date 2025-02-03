package loose_coupling.paymentsystem;

public class CreditCard extends PaymentMethod {
    public void pay() {
        System.out.println("Payment made using Credit Card.");
    }
}