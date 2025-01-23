import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Employee {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(1,2,4,5,6,4,6,4,7);

    Map<Integer , Long>  fnl =    lst.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    
   Set<Integer> h = fnl.entrySet().stream().filter(k->k.getValue()>1).map(a->a.getKey()).collect(Collectors.toSet());
     System.out.println(fnl);
    System.out.println(h);
    
    

    List<Integer> list2 = new ArrayList<>();
    list2.add(234);
    list2.add(32);
    list2.add(43);
    list2.add(83);

    List<Integer> list3 = new ArrayList<>();
    list3.add(234);
    list3.add(32);
    list3.add(43);
    list3.add(83);
    list3.add(382);
    list3.add(832);

    Set<Integer> newlst = new HashSet<>();
    newlst.addAll(list3);
    List<Integer> withoutDuplicate = new ArrayList<>(newlst);
    System.out.println(withoutDuplicate);

    }
    
}
