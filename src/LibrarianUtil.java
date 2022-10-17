import java.util.Scanner;

public class LibrarianUtil extends User implements Books  {
    LibrarianUtil(){
        books.put(1, "Fifty Shades of Grey");
        books.put(2, "The Subtle Art Of Not Giving A F*ck");
        books.put(3, "Everything is F*cked");
        books.put(4, "Harry Potter and The Philoshopher's Stone");
        books.put(5, "Atomic Habits");
    }
        
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
