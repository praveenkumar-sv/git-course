public class PaymentSrvice {
    public void processPayment(PaymentEntity payment, CustomerEntity customer) {
        // Example processing logic
        System.out.println("Processing payment of $" + payment.getAmount() + " for customer " + customer.getName());
        // Additional logic such as validating payment method, updating records, etc.
    }
    public boolean validatePaymentMethod(PaymentEntity payment) {
        // Example validation logic
        String method = payment.getPaymentMethod();
        return method.equals("Credit Card") || method.equals("Debit Card") || method.equals("PayPal");
    }
}
