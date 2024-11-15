package exceptionforpayment;

public class PaymentService {
    static int seats = 10;


    public String payment(int numberOfTickets) throws InsufficientfundExecption {
        try {

            if (numberOfTickets > 5) {
                throw new InsufficientfundExecption(PaymentStatusEnum.INSUFFICIENT_BALANCE.getcode(), PaymentStatusEnum.INSUFFICIENT_BALANCE.getLabel());
            }
        } catch (InsufficientfundExecption e) {
            System.out.println(" Exception InsufficientBalanceException occurred " + e);
            throw e;


        }
        return "SUCCESS";
    }
}
