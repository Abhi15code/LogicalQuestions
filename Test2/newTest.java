import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class newTest {
    public static void main(String[] args) {
             
        List<Integer> intlist = Arrays.asList(2,3,1,1,2,3,4,5,6,3,90,1);
        // intlist.add(new Integer(23));
       Set<Integer> setint =  intlist.stream().collect(Collectors.groupingBy(Function.identity() ,
         Collectors.counting())).entrySet().stream().filter(e-> e.getValue()==1).map(e->e.getKey()).collect(Collectors.toSet());
        System.out.println(setint);

        // System.out.println(intlist);

    }
}
