package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class eight {
    public static void main(String[] args) {
        
    List<String> ls= new ArrayList<>();
    ls.add("abhishek")  ;
    ls.add("abc") ;


    ls.stream().map(a->a.toUpperCase()).forEach(a->System.out.print(a+" | "));
        
    System.out.println();

    List<Integer> lsi = new ArrayList<>();
    lsi.add(3434);
    lsi.add(9484);
    lsi.add(434);
    lsi.add(4534);
    lsi.add(75834);
    lsi.add(9484);
    lsi.add(434);

    lsi.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);


    lsi.stream().filter(a->(a<=12000) ).map(m->(m+2000) + "|").forEach(System.out::print);


        System.out.println(" ");

    List<Integer> ls2 = lsi.stream().collect(Collectors.toList());
    System.out.println(ls2);
    System.out.println("***********\n");

        // sort the list in reverse order 
    ls2.stream().sorted(
        Comparator.reverseOrder()).
        forEach(a->System.out.println(a));
        
        ThreadGroup tg = new ThreadGroup("Thred-1");


        System.out.println("***********\n");

        ls2.stream().sorted(Comparator.naturalOrder()).forEach(a->System.out.println(a));
        
        System.out.println("**********\n");

        // Remove Duplicate Elements from a List

            List<Integer> ls3 = ls2.stream().distinct().collect(Collectors.toList());
            System.out.println(ls3);
            

            String st = null;
            System.out.println(st);
    }

    
}
