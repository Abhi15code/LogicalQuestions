public class SecondMaxInArray {
    public static void main(String[] args) {
        int arr[]    ={3,42,54,3,4,6,66,878,99};
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for(int x : arr){
            if(x>max){
                secMax = max;
                max = x;
            }
            if(x<max && x>secMax){
                secMax=x;
            }
        }
        System.out.println("max:: "+max
        );
        System.out.println("Second max  "+ secMax);
    }
}
// this logic is failed when the array is sort in decending order 
// like if we can see this above code here is x>max is max is set 654 than if statement not processed 
// dry run it 

/*  this is the sollution of the above problem

if(x<max && x>secMax){
    secMax=x;
}










      Arrays.sort(arr);
        int last = arr[n-1];
        for(int i = n-1;i>=0;i--){
            if(arr[i]!=last){
                return arr[i];
            }
            
        }
        return -1;
     
      




*/

