
public class max_in_array {
public static void main(String[] args) {
        int arr[]   = {1,2,3,4,5,6};
        int max = arr[arr.length-1];

        /*if we want  a max value from a sorted array than we have to nothing to it 
        it's obios that the last value of sorted array will be the max if it sort in accending it is in desc than the 0th potion will be
        max

        in case of unsorted array we need to sort that array first than we apply this approact on it
         * 
         */
        System.out.println(max);

        int arr1[] = {23,32,2,53,65,4};
        for(int i = 0;i<arr1.length-1;i++){
            for(int j = i+1;j<arr1.length;j++){
                if(arr1[i]>arr1[j]){
                    int temp  = arr1[j];
                    arr1[j]= arr1[i];
                    arr1[i]=temp;
                }
            }
        }
        for(int x :arr1){
            System.out.println(x);
        }
        int max1 = arr1[arr1.length-1];
        System.out.println(max1);

        


        int ar2[] = {23,42,52,523,52,66,948};
        int maxx = Integer.MIN_VALUE;

        // for(int x: ar2)
        // {
        //     if(x>maxx){
        //         maxx = x;
        //     }
        // }
        // System.out.println("    maxx"+maxx);
        int sum = 0;
        for(int i = 0;i<ar2.length-1;i++){
            for(int j =i+1;j<ar2.length;j++){
                if(ar2[i]>ar2[j]){
                    int temp = ar2[i];
                    ar2[i]=ar2[j];
                    ar2[j] = temp;
                }

                
            }

        }
        for(int x: ar2){
            sum = sum+x;
        }
        System.out.println("sum=> "+sum);
    int maxi = ar2[ar2.length-1];
    System.out.println(maxi);
}    
}
