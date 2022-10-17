// import java.util.Scanner;
public class Student extends Utils {
    Student(){
        System.out.println("```````````````````````````````````````````````````````````````````````````````````");
        System.out.println("`                              Student Login                                      `");
        System.out.println("```````````````````````````````````````````````````````````````````````````````````");
        setUserName("student");
        setPasswd("student");
    }
    void stuMain(){
        if  (login()){
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed");
        }
    }
}
