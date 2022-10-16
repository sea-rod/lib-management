public class Teacher extends User {
    Teacher(){
        System.out.println("```````````````````````````````````````````````````````````````````````````````````");
        System.out.println("`                              Teacher Login                                      `");
        System.out.println("```````````````````````````````````````````````````````````````````````````````````");
        setUserName("Teacher");
        setPasswd("Teacher");
        login();
    }
    
}
