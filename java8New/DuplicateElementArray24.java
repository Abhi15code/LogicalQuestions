package java8New;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElementArray24 {
    public static void main(String[] args) {

        
        List<Integer> lst = new ArrayList<>();
        lst.add(34);
        lst.add(83);
        lst.add(34);
        lst.add(99);
        lst.add(44);
        lst.add(44);
        lst.add(11);
      Set<Integer> st = new HashSet<>();

     

      // Set<Integer> newset  = new HashMap<Integer> (lst.stream().filter(i-> ! newset.add(i)).collect(Collectors.toSet());
        lst.stream().filter(a->  !st.add(a)).collect(Collectors.toSet());
      lst.stream().filter(lst::contains).forEach(System.out::println);
        System.out.println(st);

    }
}
