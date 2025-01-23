
package java8.occurance;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class occ2{

    public static void main(String[] args) {
        List<String> ls = Arrays.asList("Abhishek","pooja","rani","rickey","Abhishek");
        

        List<String> occ =     ls.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().
            filter(na->na.getValue()<=1).map(name->name.getKey()).collect(Collectors.toList());
            System.out.println(occ);
    }
}