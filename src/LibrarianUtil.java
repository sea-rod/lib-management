import java.util.Scanner;

public class LibrarianUtil extends Login implements Tracker  {
        
    void addBook(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Book name:");
        String name = scn.nextLine();
        System.out.println("Enter book code:");
        int code = scn.nextInt();
        books.put(code, name);
        // scn.close();
    }
    
    void removeBooks(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the book code:");
        int code = scn.nextInt();
        books.remove(code);
        scn.close();
    }
    void displayRUser(){
        rusers.forEach((roll,code)-> System.out.println(roll+" : "+takenBook.get(code)));
    }


}
