import java.util.Scanner;
public class Librarian extends User implements Books{
    Librarian(){
        System.out.println("```````````````````````````````````````````````````````````````````````````````````");
        System.out.println("`                              Librarian Login                                      `");
        System.out.println("```````````````````````````````````````````````````````````````````````````````````");
        setUserName("Admin");
        setPasswd("Admin");
        login();
        
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

}

