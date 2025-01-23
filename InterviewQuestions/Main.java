package InterviewQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    static{
        System.out.println("this is static block");
    }
    
   static String Name = "Abhishek Kumar";
   public static void main(String[] args) {
    
    List<String> newlst = Arrays.asList("Abhishek", "ankit","moon","solo","selmon","Bihal");
    System.out.println(newlst);
    Collections.shuffle(newlst);
    System.out.println(newlst);
    
    

   }
  
}
