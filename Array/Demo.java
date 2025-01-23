import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        int[] ar={23,52,6,464,7431,687,43};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i<ar.length-1;i++){







            if(ar[i]==n){
                System.out.println("it is present");
                break;
            }
            else{
                System.out.println("not present");
                break;
            }
        }

            int max = Integer.MIN_VALUE;
            int sec_max = Integer.MIN_VALUE;
            
        for(int i : ar){

            if(i>max){
                sec_max=max;
                max=i;
            }
            if(i>sec_max && i<max){
                sec_max=i;
            }
           
        }
        System.out.println(sec_max);
    }
}
