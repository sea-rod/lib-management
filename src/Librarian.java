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
        Boolean flag = login();
        while(flag){
            System.out.println("What you want to do");
            System.out.println("1.Add book\n2.Remove book\n3.Display Books available\n4.Display books taken\0.Back");
            int ch = scn.nextInt();
            if(ch==0)break;
            switch (ch){
                case 1:addBook();break;
                case 2:removeBooks();break;
                case 3:displayAvailBooks();break;
                case 4:displayTakenBooks();break;
            }
        }
    }


}

