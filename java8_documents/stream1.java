package java8_documents;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class stream1 {
    public static void main(String[] args) {
        
        Stream<String> s =Stream.of("Apple","Banana","cat","Dog");
        // s.forEach(System.out::println);
        // System.out.println(s.toString());
     String name =    s.filter(a->a.equals("cat")).map(e->e.concat(" Hello ").toUpperCase()).collect(Collectors.joining());
        System.out.println(name);

        List<String > ls = Arrays.asList("Abhishek","Deepak",
        "AmarPratap","BhanuPratap");

     Long counts =    ls.stream().filter(a->a.length()==6).count();
     System.out.println(counts);

    }
}
