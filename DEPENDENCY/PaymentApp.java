public class PaymentApp {
    public static void main(String[] args) {
        PaymentProcessor eWalletPayment = new PaymentProcessor(new EWallet());
        PaymentProcessor cashPayment = new PaymentProcessor(new Cash());
        PaymentProcessor creditCardPayment = new PaymentProcessor(new CreditCard());

        
        System.out.println("\nPayment Modes:");
        eWalletPayment.processPayment(5000.0);
        cashPayment.processPayment(3000.0);
        creditCardPayment.processPayment(50000.0);
    }
}