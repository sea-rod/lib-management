public class Librarian extends LibrarianUtil{
    void init(){
        System.out.println("```````````````````````````````````````````````````````````````````````````````````");
        System.out.println("`                              Librarian Login                                      `");
        System.out.println("```````````````````````````````````````````````````````````````````````````````````");
        setUserName("Admin");
        setPasswd("Admin");




    }
    void libMain(){
        init();
        if  (login()){
            System.out.println("Login Successful");
            int ch = 1;
            switch (ch){
                case 1:addBook();break;
                case 2:removeBooks();break;
            }
        }
    }


}

