public class AdapterPatternTest {
    public static void main(String[] args) {
        // Create instances of the payment gateways
        PayPalGateway payPalGateway = new PayPalGateway();
        StripeGateway stripeGateway = new StripeGateway();

        // Create adapters for the payment gateways
        PaymentProcessor payPalAdapter = new PayPalAdapter(payPalGateway);
        PaymentProcessor stripeAdapter = new StripeAdapter(stripeGateway);

        // Process payments through the adapters
        payPalAdapter.processPayment(100.0);
        stripeAdapter.processPayment(200.0);
    }
}
