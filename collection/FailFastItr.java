package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FailFastItr {
    public static void main(String[] args) {

        Map<Integer, String > hm =  new HashMap<>();
        hm.put(101, "abhishek");
        hm.put(102, "Hello");
        hm.put(103, "Deepak");

        Iterator itr = hm.keySet().iterator();

       while(itr.hasNext()){
        System.out.println(itr.next());

        hm.put(104, "Fail");
       }

    }
}
