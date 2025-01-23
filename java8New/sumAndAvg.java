package java8New;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sumAndAvg {
    public static void main(String[] args) {
           List<Integer> lst = new ArrayList<>();
        lst.add(34);
        lst.add(83);
        lst.add(99);
        lst.add(44);
        lst.add(11);

        int arr[] = {23,421,53 ,5};
       int a =  Arrays.stream(arr).sum();
       System.out.println("Sum of Array => "+ a);

       Double dou = Arrays.stream(arr).average().getAsDouble();
    //    int doubleAvg = Arrays.stream(arr).average();

     Arrays.sort(arr);
      for(int x : arr){
         System.out.println(x);
      }
      // System.out.println("Average Of Array => "+dou);


    }
}
