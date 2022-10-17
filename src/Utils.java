import java.util.Scanner;

public class Utils extends Login implements Tracker{
    Scanner scn = new Scanner(System.in);
    void takeBook(){
        displayBooks();
        System.out.println("Enter book code:");
        int code = scn.nextInt();
        if(books.containsKey(code)){
            System.out.println("Enter your student ID or Teacher ID:");
            int roll = scn.nextInt();
            if(rusers.containsKey(roll)){
                System.out.println("Please the previous book you have taken");
            }
            else{
                System.out.println("Please take the Book");//TODO statement later
                rusers.put(roll,code);
                takenBook.put(code,books.get(code));
                books.remove(code);
            }
        }
        else{
            System.out.println("Book does not exsit or it isnt available");
        }

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
        if (takenBook.containsKey(code)){
            books.put(code,takenBook.get(code));
            takenBook.remove(code);
            rusers.remove(code);
        }

    }
}
