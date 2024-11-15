package loginPageForException;

public interface LoginServices {
    LoginStatus login(String username,String password)throws CheckedExceptionLoginpage;
}
