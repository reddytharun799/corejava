package loginPageForException;

public class LoginPageTest {
    public static void main(String[] args) {
        LoginServices loginServices=new LoginManager();
        try {
            LoginStatus status = loginServices.login("user", "password");
            System.out.println("Login Status: "+status);
        }catch (CheckedExceptionLoginpage e){

            System.out.println("Login failed: " + e.getMessage() + " (Type: " + e.getExceptiontype() + ")");
        }catch (UncheckedLoginException e){

            System.out.println("Login error:"+ e.getMessage()+"(Type:"+e.getExceptiontype()+")");
            throw new RuntimeException("Login error");
        }

    }
}
