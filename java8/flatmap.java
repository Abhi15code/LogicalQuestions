package java8;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class flatmap {
    public static void main(String[] args) {
         List<List<String>> strlst = Arrays.asList(Arrays.asList("abhishek","Deepak","amar"),
        Arrays.asList("shahil","sohan","shanu"),
        Arrays.asList("nandni","sonali","Ramesh") );

            List<String> oneList = strlst.stream().flatMap(List::stream).collect(Collectors.toList());
            System.out.println(oneList);
            Collections.shuffle(oneList);
            System.out.println(oneList);

String as = "Abhishek";
            
			List<String> ls =Arrays.asList("Abhi","Deep","solo","Abhi");

			Map<String,Long> newls=	ls.stream().collect(Collectors.groupingBy(Function.identity()  , Collectors. counting()));
            System.out.println(newls);
            // List<String> newone = new ArrayList<>();
            // for(List<String> st: strlst){
            //     newone.addAll(strlst);
            // }
    }
    
}
