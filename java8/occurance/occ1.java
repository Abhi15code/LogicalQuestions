package java8.occurance;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class occ1 {
    public static void main(String[] args) {
        String name = "Abhishek";
        System.out.println();
    Map<Character,Long> occuranceOfCharacters =     name.chars().mapToObj(c->(char
        )c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(occuranceOfCharacters);
    }
}
