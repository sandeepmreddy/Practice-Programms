package DesignPatterns.StrategyPattern;

public class PaymentSystem {

    public static void main(String[] args) {
        PaymentContext context;

        // Paying with Credit Card
        context = new PaymentContext(new CreditCardPayment("1234-5678-9876-5432", "John Doe", "123"));
        context.executePayment(250.75);

        // Paying with PayPal
        context = new PaymentContext(new PayPalPayment("john.doe@example.com", "password123"));
        context.executePayment(150.50);

        // Paying with UPI
        context = new PaymentContext(new UpiPayment("john@upi"));
        context.executePayment(100.25);
    }
}
