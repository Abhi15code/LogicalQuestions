public class missingArray {
    public static void main(String[] args) {

        // int arr[] = new int[100];
        // for(int i = 1; i<arr.length;i++){
        //     if(i==23){
        //         continue;
        //     }
        //     arr[i-1]=i;
        // }
        
        // int num = 100*(100+1)/2;
        // int sum = 0;
        // for(int i = 0;i<arr.length;i++){
        //     sum = sum +arr[i];
        // }

        // System.out.println(num-sum);
       
        
        int arr[] = new int[100];
        for(int i = 1; i<arr.length;i++){
            if(i==23){
                continue;
            }
            arr[i-1]=i;
        }
        
        int num = 100*(100+1)/2;
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum = sum +arr[i];
        }

        System.out.println(num-sum);
    }
}
