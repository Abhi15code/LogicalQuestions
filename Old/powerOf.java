package Old;

import java.util.Scanner;

public class powerOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base number");
        int base = sc.nextInt();
        System.out.println("Enter power");
        int power = sc.nextInt();

        int result = 1;

        for(int i = 1;i<=power;i++){
            result = result*base;

        }
        System.out.println(result);

    }
}
