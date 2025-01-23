package newPractice;

import java.util.stream.Collectors;

public class java8vowels {
    public static void main(String[] args) {
        String name = "Abhishek";

      String vow =  name.chars().mapToObj(c->(char)c).filter(c-> !"[AEIOUaeiou]".contains(c.toString())).map(String::valueOf).collect(Collectors.joining());
        
      System.out.println(vow);
   
    }
}
