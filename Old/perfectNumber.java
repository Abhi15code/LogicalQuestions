package Old;

public class perfectNumber {
        public static void main(String[] args) {
            int n =6;
            int i = 1;
            int sum = 0;
            while(i<=n/2){
                if(n%i==0){
                    sum = sum+i;
                }
                i++;
            }
            if(n==sum){
                System.out.println("the number is perfect");
            }
            else
            System.out.println("the number is not perfect");
        }
}
