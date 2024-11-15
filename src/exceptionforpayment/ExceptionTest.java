package exceptionforpayment;

public class ExceptionTest {
    public void calcualtefinally(int numberofTicket) throws Exception {
        String status = null;
        try {
            System.out.println(" Available " + PaymentService.seats);

            PaymentService.seats = PaymentService.seats - numberofTicket;

            System.out.println(" Available " + PaymentService.seats);

            PaymentService paymentService = new PaymentService();
            status = paymentService.payment(numberofTicket);

        } finally {
            if (!"SUCCESS".equals(status)) {
                PaymentService.seats = PaymentService.seats + numberofTicket;
            }

            System.out.println(" post payment Available " + PaymentService.seats);
        }


    }
}
