import java.util.InputMismatchException;

public class Librarian extends LibrarianUtil{
    void init(){
        System.out.println("```````````````````````````````````````````````````````````````````````````````````");
        System.out.println("`                              Librarian Login                                    `");
        System.out.println("```````````````````````````````````````````````````````````````````````````````````");
        setUserName("admin");
        setPasswd("admin");

    }

    /**
     * Displays the functions that a librarian can perform
     */
    void libMain(){
        init();
        boolean flag = login();
        while(flag){
            try{
                System.out.println("\nWhat you want to do");
                System.out.println("1.Add book\n2.Remove book\n3.Display Books available\n4.Display books taken\n0.Back");
                int ch = scn.nextInt();
                scn.nextLine();
                if(ch==0)break;
                switch (ch) {
                    case 1 -> addBook();
                    case 2 -> removeBooks();
                    case 3 -> displayAvailBooks();
                    case 4 -> displayTakenBooks();
                    default -> System.out.println("Invalid Choice");
                }
            }
            catch (InputMismatchException e) {
                System.out.println();
                System.out.println("Invalid Input, Try Again ");
                scn.nextLine();
            }
            catch (Exception e){
                System.out.println();
                System.out.println(e + " Error Occurred, Try again");
            }
        }
    }


}

