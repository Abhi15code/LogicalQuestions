package java8New;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseString21 {
    public static void main(String[] args) {
        String str = "Abhishek";
        String sss = Arrays.stream(str.split(" ")).map(word -> new StringBuffer(word).reverse())
                .collect(Collectors.joining(" "));

        // Arrays.stream(str.split(" ")).forEach(System.out::println);
        System.out.println(sss);

        // String rev = Arrays.stream(str.split("dh")).peek(System.out::println)
        // .map(word -> new StringBuffer(word).reverse()).collect(Collectors.joining(""));

            
        // System.out.println(rev);

    }
}
