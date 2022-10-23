import java.util.Scanner;


public class Login extends Books {
    private String username;
    private String password;
    Scanner scn = new Scanner(System.in); 

    /**
     * Sets the password for the user
     * @param pass The to be set for the user
     */
    void setPasswd(String pass) {
        password = pass;
    }

    /**
     * Set the username for the user
     * @param n The username to be set for the user
     */
    void setUserName(String n) {
        username = n;
    }
    boolean login() {
        System.out.println("Enter Your Username:");
        String n = scn.nextLine();
        System.out.println("Enter Your Password:");
        String pass = scn.nextLine();
        if(username.equals(n) && password.equals(pass)) {
            System.out.println("\nLogin Successful");
            return true;
        }
        else{
            System.out.println("\nLogin Failed");
            System.out.println("Check Username And Password");
            return false;
        }
    }
}
