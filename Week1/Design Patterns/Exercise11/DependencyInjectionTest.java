public class DependencyInjectionTest {
    public static void main(String[] args) {
        // Create the repository instance
        CustomerRepository repository = new CustomerRepositoryImpl();

        // Inject repository into service
        CustomerService service = new CustomerService(repository);

        // Use the service to find a customer
        String customerDetails = service.getCustomerDetails("123");
        System.out.println(customerDetails);
    }
}
