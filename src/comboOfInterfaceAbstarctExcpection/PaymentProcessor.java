package comboOfInterfaceAbstarctExcpection;

public class PaymentProcessor {
    public static void main(String[] args) {
        try {
            Payment creditCardPayment = new CreditCardPayment("1528991hd", "162");
            creditCardPayment.processPayment(200);
            System.out.println("Credit Card Payment Status:"+creditCardPayment.getPaymentStatus());

        } catch (PaymentException e) {
            System.out.println("Credit Card Payment Error: "+ e.getMessage());
        }
        try {
            Payment paypalpayment = new PayPalPayment("25668299rr", "8210-0hdj@");
            paypalpayment.processPayment(62.0);
            System.out.println("Credit Card Payment Status:"+paypalpayment.getPaymentStatus());
        } catch (PaymentException e) {
            System.out.println("error:" + e.getMessage());
        }
    }
}
