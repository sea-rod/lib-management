// import java.util.Scanner;
public class Student extends Utils {
    void init(){
        System.out.println("```````````````````````````````````````````````````````````````````````````````````");
        System.out.println("`                              Student Login                                      `");
        System.out.println("```````````````````````````````````````````````````````````````````````````````````");
        setUserName("student");
        setPasswd("student");
    }
    void stuMain(){
        init();
        boolean flag = login();
        while (flag) {
            try {
                System.out.println("\nWhat would you like to do");
                System.out.println("1.Take Book\n2.Return Book\n3.Display books available\n0.Back\n");
                int ch = scn.nextInt();
                scn.nextLine();
                if (ch == 0) break;

                switch (ch) {
                    case 1 -> takeBook();
                    case 2 -> returnBook();
                    case 3 -> displayBooks();
                    default -> System.out.println("Invalid choice:");
                }
            } catch (Exception e) {
                System.out.println(e + " Error occurred, Try Again ");
                scn.nextLine();
            }
        }
    }
}
