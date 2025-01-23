package practivce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class two {
        public static void main(String[] args) {
            List <Integer> intls = Arrays.asList(132,4,41,4,5,62,25,633,4,25);

            Set<Integer> un = new HashSet<>(intls);
            System.out.println(un);

            List<Integer> unn = new ArrayList<>(new HashSet<>(intls));

            System.out.println(unn);


        }
}
