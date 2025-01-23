package java8New;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class maxAndMinInlst7 {
    public static void main(String[] args) {
          List<Integer> lst = new ArrayList<>();
        lst.add(34);
        lst.add(83);
        lst.add(99);
        lst.add(44);
        lst.add(11);
        System.out.println("Minimum 3 in Sorted Arraylist");
        // min 3
        lst.stream().sorted().limit(1).forEach(System.out::println);

        System.out.println("Second Largest Integer");
      
        lst.stream().sorted(
            Comparator.reverseOrder()
        ).skip(1).limit(1).forEach(System.out::println);

        System.out.println("  Maximum 3 in Sorted List   ");


        // max 3

        lst.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);


        int a =  lst.stream().max(Comparator.naturalOrder() ).get();
        System.out.println(a);

    }
}
