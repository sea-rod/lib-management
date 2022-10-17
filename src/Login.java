import java.util.Scanner;

public class Login extends Books {
    String username;
    String password;

    void setPasswd(String pass) {
        password = pass;
    }

    void setUserName(String n) {
        username = n;
    }
    boolean login() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Your Username:");
        String n = scn.nextLine();
        System.out.println("Enter your Password:");
        String pass = scn.nextLine();
        scn.close();
        if(username.equals(n) && password.equals(pass)) {
            System.out.println("Login Successful");
            return true;
        }
        else{
            System.out.println("Login Failed");
            System.out.println("Check Username and Password");
            return false;
        }
    }

}
