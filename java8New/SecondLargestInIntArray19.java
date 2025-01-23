package java8New;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SecondLargestInIntArray19 {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        lst.add(34);
        lst.add(83);
        lst.add(99);
        lst.add(44);
        lst.add(11);

        

        int a =  lst.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(a);

    }
}
