package String;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class occurenceJava8 {
    public static void main(String[] args) {
        
        String name = "abhishek";
        System.out.println("Before and after ");
        Map <Character , Long> count = name.chars().mapToObj(c->(char) c).collect(Collectors.groupingBy(Function.identity() , Collectors.counting()));
        System.out.println(count);
      
        // name.chars().mapToObj(c->(char) c).filter(a-> count.get(a)>)

       Map<Character , Long> count1 =  name.chars().mapToObj(c-> (char) c) .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
       System.out.println(count1);

        
    }
    
}
