package java8;

import java.util.Arrays;

public class missingNumbe {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,10};

        //with the java8
        

        // int n = arr.length+1;
        // int allsum = n*(n+1)/2;
        // System.out.println(allsum);

        // int summ = Arrays.stream(arr).sum();
        // System.out.println(summ);
        // System.out.println(allsum-summ);
        

        int sum = 0;
        for(int i= 0;i<=arr.length-1;i++){
            sum = sum +arr[i];
        }
        int sum2 = 0;
        for(int i = 0;i<=10;i++){
            sum2 = sum2 +i;
        }
        // System.out.println(sum2);

        int result = sum2-sum;
        System.out.println(result);
        
        int ar2[] = {1,2,3,4,5,6,7,8,10};
    
        int sum2d= 0;
        for(int i =0;i<=ar2.length-1;i++){
            sum2d  = sum2d+ar2[i];

        }
        int sum23 = 0;
for(int j =0;j<=10;j++){
    sum23 = sum23+j;

    
}

System.out.println(sum23-sum2d);
    }
    



}
