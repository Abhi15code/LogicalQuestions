package java8New;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class frequencyString {
  public static void main(String[] args) {
    List<String> slt = new ArrayList<>();
    slt.add("Abhishek");
    slt.add("Deepak");
    slt.add("Abhishek");
    slt.add("Deepak");
    slt.add("Maharaja");

    // Map<String , Long> lsts =
    // slt.stream().collect(Collectors.groupingBy(Function.identity() ,
    // Collectors.counting()));
   Set<String>  lsts=  slt.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
        .filter(entry -> entry.getValue() > 1).map(a -> a.getKey()).collect(Collectors.toSet());

    System.out.println(lsts);

  }
}
