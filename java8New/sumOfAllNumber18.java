package java8New;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class sumOfAllNumber18 {
    public static void main(String[] args) {
        Integer in = 783876872;
        Integer ii = Stream.of(String.valueOf(in).split("")).collect(Collectors.summingInt(Integer::parseInt));


        
        System.out.println(ii);

    }
}
