package java8New;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class joinStringList16 {
    public static void main(String[] args) {
        List<String> lst  = new ArrayList<>();
        lst.add("abhishek");
        lst.add("deeepak");
        lst.add("Ricki");
        lst.add("Hello this is anhishe");
        lst.add("Ankur");
        
        // jOIN list of String with Delimeter , prefix , and suffix

       String newLst =  lst.stream().collect(Collectors.joining("=>" , "1. " , "2.  "));
       System.out.println(newLst);
    }
}
