package java8New;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparingStringInLenght8 {
    public static void main(String[] args) {
        List<String> slst = new ArrayList<>();
        slst.add("Iphone 16 Ultraa pro max");
        slst.add("abhishek");
        slst.add("Deepak");
        slst.add("Nagraj");
        slst.add("suru");
        slst.add("Nokia Lumia ");
        slst.add("samsung galaxy fold ");

        System.out.println("Without Coparing *****************");
        for (String s : slst) {
            System.out.println(s);
        }

        System.out.println("After Comparing************");

        // slst.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
        slst.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);

    }
}
