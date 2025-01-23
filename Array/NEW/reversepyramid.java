package NEW;

import java.util.Scanner;

public class reversepyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the rows number");
        int rows = sc.nextInt();

        for(int i = rows;i>=1;i--){

            // printing the spaces
            for(int j = 1;j<=rows-i;j++){
                System.out.print(" ");
            }
            //int j = 1; j <= 2 * i - 1; j++

            for(int j = 1; j<=2*i-3;j++){
                System.out.print("*");

            }
            System.out.println("");

        }
    }
}
