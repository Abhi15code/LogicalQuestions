
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class last {
    public static void main(String[] args) {
       // List<Integer> lsint = Arrays.asList(23,52,521,5,11,89);
        //lsint.stream().sorted(Comparator.reverseOrder()).skip(1).limit(1).forEach(System.out::println);
        // String str = null;

        // if(str.equals("abc")) {
        
        //     System.out.println("Hi");
        
        // } else {
        
        //     System.out.println("Bye");
        
        // }

        String  name = "This this is is done by Saket Saket";
    Map<String , Long> freq =   Arrays.stream(name.split(" ")).collect(Collectors.groupingBy(Function.identity() , Collectors.counting()));
            System.out.println(freq);


            Map<Character , Long> freqchar=      name.chars().mapToObj(ch-> (char)ch).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
            System.out.println(freqchar);


//         : “This this is is done by Saket Saket”

// Output: {Saket=2, by=1, this=1, This=1, is=2, done=1}
      }
}
