package java8New;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class merge2SortedArrayin1sorted5 {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        lst.add(34);
        lst.add(83);
        lst.add(99);
        lst.add(44);
        lst.add(11);

        int arr[] = { 23, 52, 14, 6, 34, 2, 5, 2, 23 };

        List<Integer> intlst = new ArrayList<>();
        for (int a : arr) {
            intlst.add(a);
        }

        System.out.println("frequency of each integer");
        Map<Integer, Long> imap = intlst.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(imap);
        
        System.out.println("The duplicate integers");
Set<Integer> newset =         intlst.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
                .filter(entry -> entry.getValue() > 1).map(a -> a.getKey()).collect(Collectors.toSet());
                System.out.println(newset);
        // lst.stream().sorted().limit(3).forEach(System.out::println);

    }
}
