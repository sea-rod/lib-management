import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int ch;
        do {
            System.out.println("Login as: ");
            System.out.println("1.Librarian 2.Teacher 3.Student 0.Exit...");
            ch = scn.nextInt();
            switch (ch) {
                case 1 -> {
                    Librarian l = new Librarian();
                    l.libMain();
                }
                case 2 -> {
                    Teacher t = new Teacher();
                    t.teachMain();
                }
                case 3 -> {
                    Student s = new Student();
                    s.stuMain();
                }
                default -> System.out.println("Invalid Value Entered");
            }
        }while (ch != 0);
    }
    
}
