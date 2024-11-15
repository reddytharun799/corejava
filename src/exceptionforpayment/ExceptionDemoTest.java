package exceptionforpayment;

public class ExceptionDemoTest {
    public static void main(String[] args)  {



        try {
            ExceptionTest test = new ExceptionTest();
            test.calcualtefinally(6);

            System.out.println(" Ticket booking is done");
        }catch (Exception e){
            System.out.println(e+e.getMessage());
        }

        System.out.println(" I am done calculation");


    }
}
