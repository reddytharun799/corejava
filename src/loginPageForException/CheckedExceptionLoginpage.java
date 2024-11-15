package loginPageForException;

public class CheckedExceptionLoginpage extends Exception{
    private LoginExceptionType exceptiontype;

    public CheckedExceptionLoginpage(String message, LoginExceptionType exceptionType){
        super(message);
        this.exceptiontype= exceptionType;
    }

    public LoginExceptionType getExceptiontype() {
        return exceptiontype;
    }
}
