package String;
import java.util.*;
import java.util.stream.Collectors;

public class que {
    public static void main(String[] args) {
        List<Integer> lsint = new ArrayList<>();
        lsint.add(1);
        lsint.add(2);
        lsint.add(3);
        lsint.add(1);
        lsint.add(2);

        List<Integer> lsint2 = new ArrayList<>();
        lsint.add(1);
        lsint.add(2);
        lsint.add(4);
        lsint.add(1);
        lsint.add(5);

        lsint.addAll(lsint2);
        System.out.println("with the help of Stream");
       Set<Integer> i = lsint.stream().collect(Collectors.toSet());

       System.out.println(i);
        System.out.println("this is with the help of without stream ");
        Set<Integer> newset = new HashSet<>();
        for(int s: lsint){
            newset.add(s);

        }
        System.out.println(newset);
    }
}
