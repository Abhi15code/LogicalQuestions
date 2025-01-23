
package InterviewQuestions;

import java.util.*;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class shuffle {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("banana");
        fruits.add("pineApple");
        fruits.add("Apple");
        fruits.add("peech");
        fruits.add("Cheeku");

            Collections.shuffle(fruits);
        
        System.out.println("Before Use of Shuffle  ");
        System.out.println(fruits);
        Collections.shuffle(fruits);
        
        System.out.println("After Shuffle   ");
        System.out.println(fruits);
       
    }
}
     