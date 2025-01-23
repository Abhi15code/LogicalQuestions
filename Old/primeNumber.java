package Old;

import java.util.Scanner;

public class primeNumber {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number ");
      int num = sc.nextInt();
      int divisionCount = 0;
      for(int i = 1;i<=num;i++){
         if(num%i==0){
            divisionCount++;
         }
      }
      if(divisionCount==2){
         System.out.println("Number is prime");
      }
      else{
         System.out.println("Number is not prime");
      }

   } 
}
