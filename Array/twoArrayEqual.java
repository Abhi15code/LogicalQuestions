import java.util.Arrays;

public class twoArrayEqual {
    

    public static boolean checkEqual(int A[] , int B[] , int N){

        // int n = arr1.length;
        // int m = arr2.length;
        
        // if(n!=m)
        //     return 1;


        // Arrays.sort(arr1);
        // Arrays.sort(arr2);

        // for(int i = 0;i<n;i++){
        //     if(arr1[i]!=arr2[i])
        //         return  1;
        // }
        // return 0;

        Arrays.sort(A);
        Arrays.sort(B);
        
        for(int i=0;i<N;i++){
            if(A[i]!=B[i])
             return false;
        }
    
        return true;
        
     }
    

    public static void main(String[] args) {
        
        int arr[]  = {43,1,23};
        int arr2[] = {23,43,1};

      boolean x = checkEqual(arr,arr2,3);
        System.out.println(x);
    }

}
