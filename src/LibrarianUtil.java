import java.util.Scanner;

public class LibrarianUtil extends Login implements Tracker  {
    Scanner scn = new Scanner(System.in);
    void addBook(){
        System.out.println("Enter Book name:");
        String name = scn.nextLine();
        System.out.println("Enter book code:");
        int code = scn.nextInt();
        books.put(code, name);
    }
    
    void removeBooks(){
        System.out.println("Enter the book code:");
        int code = scn.nextInt();
        books.remove(code);
    }
    void displayBooks(){
        System.out.println("Books Available");
        books.forEach((code,name)-> System.out.println(code+" : "+name));
        System.out.println("\nBook that are taken");
        System.out.println("\nId:code");
        rusers.forEach((roll,code)->System.out.println(roll+":"+takenBook.get(code)));

    }


}
