package InterviewQuestions;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingBy {
    public static void main(String[] args) {

        String s1 = new String("Hello");
        String s2 = "Hello";

        System.out.println(s1==s2);
      
        List<String> name = Arrays.asList("Abhishek" , "Ankur", "Abhishek","Rahul", " som");
        
        List<String> names = Arrays.asList("ABC", "CAB", "BCA"); 
         String st =   names.stream().reduce("" , (a,b)-> a+b.charAt(1));
           System.out.println(st);
        
        Map<String , Long> groupmap = name.stream().collect(Collectors.groupingBy(Function.identity() , Collectors.counting()));
            
            System.out.println(groupmap);

            List<Integer> intlst = Arrays.asList(12,42,53,551,89,53);

            Map<Integer,Long> intmap = intlst.stream().collect(Collectors.groupingBy(Function.identity() , Collectors.counting()));

        System.out.println(intmap);

                
    }
}
