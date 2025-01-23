package InterviewQuestions;

import java.util.*;
import java.util.stream.Collectors;

public class ListToSet {
    public static void main(String[] args) {
        List<String> lista = Arrays.asList("abhishek", "pooja", "Kushma", "abhishek", "Deepak");
        System.out.println("List " +lista);

        Set<String> lset = new HashSet<>();
        
        for(String s: lista){
            lset.add(s);
        }
        System.out.println(lset);

            Set<String> set2 = new HashSet<>(lista);
            System.out.println(set2);

            Set<String> set3 = new HashSet<>();
            set3.addAll(lista);

            System.out.println(set3);

           Set<String> set4 =  lista.stream().collect(Collectors.toSet());
           System.out.println(set4);

           
    }

}
