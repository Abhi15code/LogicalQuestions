package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class test1 {
    public static void main(String[] args) {
        List <Integer> ls = new ArrayList<>();
        for(int i =0;i<20;i++){
            ls.add(i);

        }
        System.out.println(ls);


        List <Integer> ls2 = new ArrayList<>();
        for(int x: ls){
            if(x %2 ==0){
                ls2.add(x);

            }
        }
        System.out.println(ls2);

        //with Stream

        List<Integer> ls3 = ls.stream().filter(a->a%2==0).collect(Collectors.toList());
        System.out.println(ls3);
    }
}
