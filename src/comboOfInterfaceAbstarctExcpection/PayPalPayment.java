package comboOfInterfaceAbstarctExcpection;

public class PayPalPayment extends Basepayment{
    private String email;
    public PayPalPayment(String transactionId,String email) {
        super(transactionId);
        this.email=email;
    }

    @Override
    public void processPayment(double amount) throws PaymentException {
        validatePaymentDetails();
        System.out.println("Processing PayPal payment of $" + amount);
        logTransaction();
        this.Status=PaymentStatus.SUCCESS;

    }

    @Override
    public void validatePaymentDetails() throws PaymentException {
        if (email == null || !email.contains("@")){
            throw new PaymentException("Invalid paypal email address!");


        }
        System.out.println("Paypal details validated");

        }

    }

