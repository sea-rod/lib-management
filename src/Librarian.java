public class Librarian extends LibrarianUtil{
    Librarian(){
        super();
        System.out.println("```````````````````````````````````````````````````````````````````````````````````");
        System.out.println("`                              Librarian Login                                      `");
        System.out.println("```````````````````````````````````````````````````````````````````````````````````");
        setUserName("Admin");
        setPasswd("Admin");
        login();
        
    }


}

