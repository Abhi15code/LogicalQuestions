package newPractice;

import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int base = sc.nextInt();
        int result=1;
        for(int i=1;i<=base;i++){
            result = result*n;

        }
        System.out.println(result);
    }
}
