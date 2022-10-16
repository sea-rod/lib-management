import java.util.Scanner;

public class Login {
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
        if(n == username && password == pass)
        return true;
        else
        return false;
    }
    
}
