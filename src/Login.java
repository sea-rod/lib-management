import java.util.Scanner;
public class Login {
    String name;
    String password;

    void setPasswd(String pass){
        password = pass;
    }
    void setName(String n){
        name = n;
    }

    boolean login(){
        String n,pass;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Your Name:");
        n = scn.nextLine();
        System.out.println("Enter your passsword:");
        pass = scn.nextLine();
        scn.close();
        if (n == "admin" && pass == "admin")
            return true;
        else
            return false;
    }
}
