package java8New;
import java.util.*;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class new1 {
   // Input ={'w','e','a','f','w','e','g','y','w','e','a'} find the duplicate elements using lambda and stream

   public static void main(String[] args) {
    

        char ch[]  = {'w','e','a','f','w','e','g','y','w','e','a'};

        List<Character>  chlst  = new ArrayList<>();

        for(char c: ch){
         chlst.add(c);
        }
         // Set<Character> duplicates = inputList.stream()
         //    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
         //    .entrySet().stream()
         //    .filter(entry -> entry.getValue() > 1)
         //    .map(Map.Entry::getKey)
         //    .collect(Collectors.toSet());

     Map<Character , Long> fls =   chlst.stream().collect(Collectors.groupingBy(Function.identity() , Collectors.counting()));
     System.out.println(fls);
      
     
         
   }
}
