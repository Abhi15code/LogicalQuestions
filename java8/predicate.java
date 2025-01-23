package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class predicate {
    public static void main(String[] args) {
        
        List<String> lis = new ArrayList<>();
        lis.add("cat");
        lis.add("Dog");
        lis.add("Jungle");
        lis.add("sher");
        List<Integer> lis2 = new ArrayList<>();
        lis2.add(122);
        lis2.add(333);
        lis2.add(12);
        lis2.add(900);
        System.out.println("sorted and reverse order");
        lis2.stream().sorted(Comparator.reverseOrder()).forEach(a->System.out.println(a));


        System.out.println("seperate odd and even number");

        lis2.stream().collect(Collectors.partitioningBy(i->(i%2==0)));
        System.out.println(lis2);
    //   lis.stream().map(l->l.getClass()).forEach(a->System.out.println(a));
    }
    
}
