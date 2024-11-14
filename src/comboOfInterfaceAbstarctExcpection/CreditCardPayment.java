package comboOfInterfaceAbstarctExcpection;

public class CreditCardPayment extends Basepayment{
    private  String cardNumber;

    public CreditCardPayment(String transactionId,String cardNumber) {
        super(transactionId);
        this.cardNumber= cardNumber;
    }

    @Override
    public void processPayment(double amount) throws PaymentException {
        validatePaymentDetails();
        System.out.println("Processing paypal payment of $"+ amount);
        logTransaction();
        this.Status=PaymentStatus.SUCCESS;

    }

    @Override
    public void validatePaymentDetails() throws PaymentException {
        if(cardNumber == null|| cardNumber.length()!=3){
            throw new PaymentException("Invalid credit card number");

        }
        System.out.println("credit card details validated.");

    }


}
