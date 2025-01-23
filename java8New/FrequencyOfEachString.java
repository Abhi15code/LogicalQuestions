package java8New;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachString {
        public static void main(String[] args) {
            String str = "this is abhishek so how abhishek";
            Map<Character , Long> strr =  str.chars().mapToObj(c->(char) c ).collect(Collectors.groupingBy(Function.identity() , Collectors.counting()));
            System.out.println(strr);
            
            
        }
}
