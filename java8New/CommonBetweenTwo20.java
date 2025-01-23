package java8New;

import java.util.ArrayList;
import java.util.List;

public class CommonBetweenTwo20 {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        lst.add(34);
        lst.add(83);
        lst.add(99);
        lst.add(44);
        lst.add(11);

        List<Integer> lst2 = new ArrayList<>();
        lst2.add(34);
        lst2.add(83);
        lst2.add(32);
        lst2.add(44);
        lst2.add(11);

        // lst2.stream().filter(lst::contains).forEach(System.out::println);
        lst2.stream().filter(lst::contains).forEach(System.out::println);

    }
}
