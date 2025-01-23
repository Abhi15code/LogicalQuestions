package newPractice;

public class duplicateArray {
    public static void main(String[] args) {
        System.out.println("Hello this is main method");
        int arr[] = {23,5,52,5,623,5};
        int arr1[] = new int [arr.length];
        int k = 0;
        
        for(int i =0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(!ispresent(arr1, arr[i])){

                    if(arr[i]==arr[j]){
                        System.out.println(arr[i]);
                        arr1[k]=arr[i];
                        k++;

                    }

                }
            }
            
        }
    }

    public static boolean ispresent(int arr[], int key){
        for(int x: arr){
            if(x==key)
            return true;
          
        }
        return false;
    }
}
