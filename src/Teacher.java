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
        takeBook();
    }
    
}
