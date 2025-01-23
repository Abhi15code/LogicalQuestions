package java8New;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class maxnMinInLst17 {
    public static void main(String[] args) {
      List<Integer> lst = new ArrayList<>();
        lst.add(34);
        lst.add(83);
        lst.add(99);
        lst.add(44);
        lst.add(11);

        System.out.println("Minimum in List");
        lst.stream().sorted().limit(1).forEach(System.out::println);// this is given by me dimag laga ke but this is not valid solutino

      int min=   lst.stream().min(Comparator.naturalOrder()).get();// this is valid solution
      System.out.println(min);

        System.out.println("Maximum in List ");
        lst.stream().sorted(Comparator.reverseOrder()).limit(1).forEach(System.out::println);// this solution is by me 

        // this is valid solution
        int max = lst.stream().max(Comparator.naturalOrder()).get();
        System.out.println(max);


      int a =  lst.stream().min(Comparator.naturalOrder()).get();
      System.out.println(a);
    }
}
