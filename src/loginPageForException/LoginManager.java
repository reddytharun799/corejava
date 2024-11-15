package loginPageForException;

public class LoginManager implements LoginServices{
    private static String VALID_USERNAME = "User";
    private static String VALID_PASSWORD="password";
    private static boolean ACCOUNT_LOCKERD= false;
    @Override
    public LoginStatus login(String username, String password) throws CheckedExceptionLoginpage {
        if (ACCOUNT_LOCKERD){
            throw new CheckedExceptionLoginpage("Account is locked",LoginExceptionType.ACCOUNT_LOCKED);
        }
        if(VALID_USERNAME.equals(username)&&VALID_PASSWORD.equals(password)){
            return LoginStatus.SUCCESS;
        }else {

            throw new UncheckedLoginException("invalid credentials",LoginExceptionType.INVALID_CREDENTIALS);
        }

    }
}
