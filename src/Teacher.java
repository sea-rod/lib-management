public class Teacher extends Utils {
    Teacher(){

    }
    void init(){
        System.out.println("```````````````````````````````````````````````````````````````````````````````````");
        System.out.println("`                              Teacher Login                                      `");
        System.out.println("```````````````````````````````````````````````````````````````````````````````````");
        setUserName("Teacher");
        setPasswd("Teacher");
    }
    void teachMain() {
        init();
        boolean flag = login();
        while (flag) {
            try {
                System.out.println("\nWhat would you like to do");
                System.out.println("1.Take Book\n2.Return Book\n3.Display Books available\n0.Back\n");
                int ch = scn.nextInt();
                scn.nextLine();
                if (ch == 0) break;

                switch (ch) {
                    case 1 -> takeBook();
                    case 2 -> returnBook();
                    case 3 -> displayBooks();
                    default -> System.out.println("Invalid choice:");
                }
            }
            catch (Exception e) {
                System.out.println(e + " Error occurred, Try Again ");
                scn.nextLine();
            }
        }
    }
    
}
