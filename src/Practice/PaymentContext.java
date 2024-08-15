package Practice;


public class PaymentContext {

private PaymentStrategy paymentStrategy;

    PaymentContext(PaymentStrategy paymentStrategy)
    {
        this.paymentStrategy=paymentStrategy;
    }

    void callPayment(double amt) {
        paymentStrategy.pay(amt);
    }

}
