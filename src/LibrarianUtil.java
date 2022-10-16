import java.util.Scanner;

public class LibrarianUtil extends User implements Books  {

        
    void addBook(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Book name:");
        String name = scn.nextLine();
        System.out.println("Enter book code:");
        int code = scn.nextInt();

        books.put(code, name);
        scn.close();
    }
    
    void removeBooks(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the book code:");
        int code = scn.nextInt();
        books.remove(code);
        scn.close();
    }

}
