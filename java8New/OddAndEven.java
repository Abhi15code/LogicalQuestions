package java8New;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OddAndEven {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(1,2,4,5,6,3,233);
     Map<Boolean , List<Integer>> ii = lst.stream().collect(Collectors.partitioningBy(i->i%2==0));
System.out.println(ii);

    }
    
}
