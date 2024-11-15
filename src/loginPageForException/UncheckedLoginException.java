package loginPageForException;

public class UncheckedLoginException extends RuntimeException{
    private LoginExceptionType exceptiontype;
    public UncheckedLoginException(String message, LoginExceptionType exceptiontype){
        super(message);
        this.exceptiontype= exceptiontype;
    }

    public LoginExceptionType getExceptiontype() {
        return exceptiontype;
    }
}
