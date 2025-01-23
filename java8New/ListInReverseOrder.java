package java8New;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListInReverseOrder {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        lst.add(34);
        lst.add(83);
        lst.add(99);
        lst.add(44);
        lst.add(11);
        lst.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

    }
    
}
