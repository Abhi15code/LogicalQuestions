
package newPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Superclass{
    int a = 23;
    public void m1(){
        System.out.println("this is m1 method ");
    }

}

public class test11  extends Superclass {

    public void m2(){
        
        System.out.println(super.a);
        super.m1();
    }
    public static void main(String[] args) {

        test11 t  = new test11();
        t.m2();


        List<Integer> list1 = new ArrayList<>();

        List<Integer> list2 = new ArrayList();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(1);
        
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(1);
        list2.add(5);

        list1.addAll(list2);


        char c[] = {
            'a','b','c','d' ,'a','b'
        };

        List<Character> car = new ArrayList<>();

        for(char cc: c){
            car.add(cc);

        }
        Set<Character> charset = car.stream().collect(Collectors.toSet());
        System.out.println(charset);



      Set mset =   list1.stream().collect(Collectors.toSet());
      System.out.println(mset);
        Set<Integer> newset = new HashSet<>();
        
        for(Integer x: list1){
            newset.add(x);
        }
        System.out.println(newset);
       


        





    
    }


    
}
