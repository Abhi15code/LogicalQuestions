package memory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class occuranceStringjava8 {
    public static void main(String[] args) {
        List<String> lsstr = new ArrayList<>();
        lsstr.add("Abhishek");
        lsstr.add("Deepak");
        lsstr.add("shalu");
        lsstr.add("kushma");
        lsstr.add("Abhishek")   ;
        lsstr.add("shalu")  ;

   List<String> unique  =  lsstr.stream().collect(Collectors.groupingBy(Function.identity(),
    Collectors.counting())).entrySet().stream().filter(ke->ke.getValue()>1)
    .map(k-> k.getKey()).collect(Collectors.toList());

   System.out.println(unique);
















        

     Map<String , Long> occurance =   lsstr.stream().collect(Collectors.groupingBy(Function.identity() , Collectors.counting()));

    Set<String> dupicate =  occurance.entrySet().stream().filter(entry-> entry.getValue()>1).map(m -> m.getKey()).collect(Collectors.toSet());

     System.out.println(occurance);
     System.out.println(dupicate);


    }
}
