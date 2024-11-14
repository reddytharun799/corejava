package comboOfInterfaceAbstarctExcpection;

public interface Payment {
    void processPayment(double amount) throws PaymentException; // Method to process payment
    void validatePaymentDetails() throws PaymentException;// Validation for payment details
    PaymentStatus getPaymentStatus();
}

