package java8New;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RemoveDuplicate14 {
    public static void main(String[] args) {
        List<String> slst = new ArrayList<>();
        slst.add("abhishek");
        slst.add("Deepak");
        slst.add("Maharaja");
        slst.add("abhishek");
        slst.add("Deepak");
        System.out.println("Before Remove");
        System.out.println(slst);

       List<String> newList =  slst.stream().distinct().collect(Collectors.toList());

       System.out.println("After Remove of Duplicate String ");
       System.out.println(newList);


    }
}
