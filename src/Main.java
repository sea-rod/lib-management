import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Librarian l = new Librarian();
        Teacher t = new Teacher();
        Student s = new Student();
        int ch;//TODO books
        Books.initBooks();
        do {
            System.out.println("Login as: ");
            System.out.println("1.Librarian 2.Teacher 3.Student 0.Exit...");
            ch = scn.nextInt();
            switch (ch) {
                case 1 -> {
                    l.libMain();break;
                }
                case 2 -> {
                    t.teachMain();break;
                }
                case 3 -> {
                    s.stuMain();break;
                }
                default -> System.out.println("Invalid Value Entered");
            }
        }while (ch != 0);
    }
    
}
