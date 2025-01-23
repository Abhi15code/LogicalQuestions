public class FindMissingInArray {
    public static void main(String[] args) {
        
        int sum = 0;
        int arr[]  ={3,7,8,9,10};
        for(int i = 0;i<arr.length-1;i++ ){
            sum = sum +arr[i];
        }

        int sum2 = 0;
        for(int j = 1;j<10;j++){
            sum2  = sum2+j;
        }
        System.out.println(sum2-sum);
        System.err.println("***");

        for(int i=0;i<arr.length-1;i++ ){
            for(int j=arr[i]+1;j<arr[i+1];j++){
                System.out.println(j+"  ");
            }
        }
    }
    
}
