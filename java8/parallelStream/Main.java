package java8.parallelStream;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        
        // we calculate time in milisecond how much time it takes to complete
/* 
        long start;
        long end;

        System.out.println("through plain stream************");
        start  = System.currentTimeMillis();
        IntStream.range(1, 100).forEach(System.out::println);
        end = System.currentTimeMillis();

        System.out.println("time taken in msec  "+(end-start));
        System.out.println("++++++++++++++++++++");

        start  = System.currentTimeMillis();
        IntStream.range(1, 100).parallel().forEach(System.out::println);
        end = System.currentTimeMillis();

        System.out.println("time taken in msec  "+(end-start));

*/

            IntStream.range(1, 10).forEach(
                a-> System.out.println("Thread :: "+Thread.currentThread().getName()+" :: "+a)
            );

                System.out.println("==========   Prallel Stream   ========");
            IntStream.range(1, 10).parallel().forEach( x->
                System.out.println("Thread :: "+Thread.currentThread().getName()+" :: "+ x)
            );



    }
}
