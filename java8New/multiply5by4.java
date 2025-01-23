package java8New;

import java.util.ArrayList;
import java.util.List;

public class multiply5by4 {

public static void main(String[] args) {
     List<Integer> lst = new ArrayList<>();
        lst.add(34);
        lst.add(10);
        lst.add(99);
        lst.add(55);
        lst.add(11);

        lst.stream().filter(a-> a%2==0).map(a-> a*5).forEach(System.out::println);


        // lst.stream().map(a->a*5).forEach(System.out::println);
        // lst.stream().filter(i->i%5==0).forEach(System.out::println);
        
}
}
