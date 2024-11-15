package exceptionInterfaceAbstarctSBI;

public class BalanceUnavaliableException extends RuntimeException {
    private String code;
    public BalanceUnavaliableException(String code,String message){
        super(message);
        this.code =code;

    }
}
