import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;


public class Login extends Books {
    String username;
    String password;
    Scanner scn = new Scanner(System.in);
    void setPasswd(String pass) {
        password = pass;
    }

    void setUserName(String n) {
        username = n;
    }
    boolean login() {
        System.out.println("Enter Your Username:");
        String n = scn.nextLine();
        System.out.println("Enter your Password:");
        String pass = scn.nextLine();
        if(username.equals(n) && password.equals(pass)) {
            System.out.println("\nLogin Successful");
            return true;
        }
        else{
            System.out.println("\nLogin Failed");
            System.out.println("Check Username and Password");
            return false;
        }
    }

    static void addUser(int Id,String pass){
        try {
            File myObj = new File("res/User.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } 
            else {
                System.out.println("File already exists.");
                FileWriter file = new FileWriter("res/User.txt",true);
                file.append("joe ma333223ma\n");
                file.close();

                Scanner read = new Scanner(myObj);
                while (read.hasNextLine()) {
                    String data = read.nextLine();
                    System.out.println(data);
                  }
                  read.close();
    
            }
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }


}
