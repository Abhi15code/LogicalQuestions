package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionString {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();
        ls.add("Ankur");
        ls.add("abc");
        ls.add("Ankur");
        ls.add("bcdee");
        ls.add("ijdi");
        System.out.println("using distinct ");
        ls.stream().distinct().forEach(System.out::println);
        
        List<String> ls2 = ls.stream().distinct().collect(Collectors.toList());
        System.out.println(ls2);
        System.out.println("this is the**********");

        ls.stream().distinct().forEach(System.out::println);

        ls.stream().distinct().forEach(System.out::println);
        

        List<String> ok = Arrays.asList("Abhishek","Deepak","sahul");
        ok.add("sohan") ;


    }
}
