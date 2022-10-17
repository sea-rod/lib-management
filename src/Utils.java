import java.util.Scanner;

public class Utils extends Login implements Books{
    void getBook(){
        displayBooks();
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter book code:");
        scn.close();
    }

    void displayBooks(){
        books.forEach((c,n)->System.out.println(c+" : "+n));
    }
}
