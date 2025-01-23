package practivce;

import java.util.Scanner;

public class arm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a number ");
        int n = sc.nextInt();
        int temp = n;
        int arm = n;
        int count = 0;
        int sum = 0;

        while (n>0){
            count++;
            n = n/10;

        }
        System.out.println(count);
        while(temp>0){
            int rem = temp%10;
            int power = count;
            int base =  rem;
            int result = 1;
            for(int i = 1;i<=power;i++){
                result = result*base;
            }
            sum = sum +result;
            temp = temp/10;
        }
        System.out.println(sum);
            if(arm == sum ){
                System.out.println("the number is arm");
            }
            else
                System.out.println("sorry this is not a arm number");


    }
}
