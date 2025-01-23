package Old;

import java.util.Scanner;

public class fibonacci{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int n1 = sc.nextInt();
        System.out.println("Enter second number");
        int n2 = sc.nextInt();
        System.out.println("Enter count");
       int count= sc.nextInt();


     

        int result=0;
       for(int i = 1;i<=count;i++){
           result = n1+n2;
           System.out.print(result+" ");
           n1 = n2;
           n2 = result;
       }

    }
}