package java8New;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class findDulicateString {
    public static void main(String[] args) {
        List<String> slst = new ArrayList<>();
        slst.add("abhishek");
        slst.add("Deepak");
        slst.add("Ankur");
        slst.add("Rahul");
        slst.add("Ankur");
        slst.add("abhishek");
        // Map<String , Long> newstr =
        // Set<String> DuplicateString =
        // slst.stream().collect(Collectors.groupingBy(Function.identity() ,
        // Collectors.counting()))
        // .entrySet().stream().filter(a->a.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toSet())
        // ;

        // System.out.println(DuplicateString);
        // Set<String> uni = slst.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
        //         .entrySet().stream().filter(a -> a.getValue() > 1).map(m -> m.getKey()).collect(Collectors.toSet());
        // System.out.println(uni);

        
		List<Integer> listint = Arrays.asList(1,2,1,2,4,5,6,3,4);
		//so the requarement of this problem is to return only uniqu elements
		listint.stream().collect(Collectors.groupingBy(Function.identity() , 
        Collectors.counting())).entrySet().stream().filter(el-> el.getValue()==1).
        map(e->e.getKey()).forEach(System.out::println);

    }
}
