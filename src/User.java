import java.util.Scanner;
public class User extends Login {
    
    Scanner scn = new Scanner (System.in);
    void checkUser(){
        int user;
        scn.close();
        System.out.println("Select user: ");
        do {
            System.out.println("1.Teacher 2.Student 3.Librarian");
            user = scn.nextInt();
            switch(user) {
                case 1:
                case 2:
                case 3:
                    login();
                break;
                default: System.out.println("Invalid Input.");
                break;
            }
        }while (user != 0);
    }
    
}
