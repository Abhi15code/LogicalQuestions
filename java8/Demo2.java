package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {
    public static void main(String[] args) {
        String st = "Abhishek";
     String copy=   st.concat("Kumar");
        System.out.println(st);
        System.out.println(copy);

       List<List<String> >ng =   Arrays.asList(Arrays.asList("ab","bc","cd")
       ,Arrays.asList("deepak","sony"),Arrays.asList("rahil","sooo"));
        
        System.out.println(ng);

        List<String > one = ng.stream().flatMap(List::stream).collect(Collectors.toList());
        Collections.shuffle(one);
        System.out.println(one);

    }
}
