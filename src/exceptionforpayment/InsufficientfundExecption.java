package exceptionforpayment;

public class InsufficientfundExecption extends Exception{

    private String code;

    public InsufficientfundExecption(String message) {

        super(message);
    }

    public InsufficientfundExecption(String message, String code) {
        super(message);
        this.code = code;
    }


}
