package comboOfInterfaceAbstarctExcpection;

public abstract class Basepayment implements Payment {
    protected String transactionId;
    protected PaymentStatus Status;

    public Basepayment(String transactionId) {
        this.transactionId = transactionId;
    }

    public void logTransaction() {
        System.out.println("Logging transaction ID: " + transactionId);
    }

    public abstract void validatePaymentDetails() throws PaymentException;

    @Override
    public PaymentStatus getPaymentStatus() {
        return this.Status;
    }
}

