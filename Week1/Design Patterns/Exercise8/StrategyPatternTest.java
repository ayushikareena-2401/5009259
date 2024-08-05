public class StrategyPatternTest {
    public static void main(String[] args) {
        // Create payment strategies
        PaymentStrategy creditCard = new CreditCardPayment("1234-5678-9876-5432");
        PaymentStrategy paypal = new PayPalPayment("user@example.com");

        // Create context and use different strategies
        PaymentContext context = new PaymentContext(creditCard);
        context.executePayment(150);

        context = new PaymentContext(paypal);
        context.executePayment(200);
    }
}
