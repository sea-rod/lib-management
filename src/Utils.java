import java.util.HashMap;
import java.util.Scanner;

public class Utils extends Login implements Books{
    Scanner scn = new Scanner(System.in);
    void takeBook(){
        displayBooks();
        System.out.println("Enter book code:");
        int code = scn.nextInt();
        System.out.println("Please take the Book");//TODO statement later
        takenBook.put(code,books.get(code));
        books.remove(code);

    }

    void displayBooks(){
        books.forEach((c,n)->System.out.println(c+" : "+n));
    }

    void displayTakenBooks(){
        takenBook.forEach((c,n)->System.out.println(c+" : "+n));
    }


    public void returnBook() {
        displayTakenBooks();
        System.out.println("Enter the book code your returning:");
        int code = scn.nextInt();
        books.put(code,takenBook.get(code));
        takenBook.remove(code);

    }
}
