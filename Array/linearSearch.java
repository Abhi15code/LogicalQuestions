public class linearSearch {
    public static void main(String[] args) {
        int arr[] = {23,45,2,32,64,64,34,9};
     int xx =    search(arr, 999);
     System.out.println(xx);

    }

    public static int search(int arr[] , int key){
       for(int i = 0;i<arr.length;i++){
            if(arr[i]==key)
                return i;
       }
       return  -1;

    }

    // public static int search(int arr[] , int key){
        // for(int x:arr){
        //     if(x==key){
        //         return x;
        //     }
        // }
//         for(int i = 0;i<arr.length;i++){
//             if(arr[i]==key){
//                 return i;
//             }
//         }
//         return -1;
    // }



}
