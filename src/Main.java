import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Librarian l = new Librarian();
        Teacher t = new Teacher();
        Student s = new Student();
        int ch;
        Books.initBooks();
        do {
            System.out.println("\nLogin as: ");
            System.out.println("1.Librarian 2.Teacher 3.Student 0.Exit...");
            ch = scn.nextInt();
            scn.nextLine();
            if(ch==0)break;
            switch (ch) {
                case 1 -> {
                    l.libMain();
                }
                case 2 -> {
                    t.teachMain();
                }
                case 3 -> {
                    s.stuMain();
                }
                default -> System.out.println("Invalid Value Entered");
            }
        }while (ch != 0);
    }
    
}
