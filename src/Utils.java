import javax.rmi.ssl.SslRMIClientSocketFactory;

public class Utils extends Login implements Tracker{
    void takeBook(){
        displayBooks();
        System.out.println("Enter book code:");
        int code = scn.nextInt();
        scn.nextLine();
        if(books.containsKey(code)){
            System.out.println("Enter your student ID or Teacher ID:");
            int roll = scn.nextInt();
            scn.nextLine();
            if(rusers.containsKey(roll)){
                System.out.println("Please the previous book you have taken");
            }
            else{
                System.out.println("Please take the Book");//TODO statement later
                rusers.put(roll,code);
                takenBook.put(code,books.get(code));
                libBookTakenList.putAll(takenBook);
                books.remove(code);
            }
        }
        else{
            System.out.println("Book does not exsit or it isnt available");
        }

    }

    void displayBooks(){
        System.out.println();
        System.out.println(String.format("%-10s:name","Code"));
        books.forEach((c,n)->System.out.println(String.format("%-10d:%s",c,n)));
    }

    void displayTakenBooks(){
        System.out.println();
        System.out.println(String.format("%-10s:name","Code")); 
        takenBook.forEach((c,n)->System.out.println(String.format("%-10d:%s",c,n)));
    }


    public void returnBook() {
        displayTakenBooks();
        System.out.println("Enter the book code your returning:");
        int code = scn.nextInt();
        scn.nextLine();
        if (takenBook.containsKey(code)){
            books.put(code,takenBook.get(code));
            takenBook.remove(code);
            rusers.remove(code);
        }

    }
}
