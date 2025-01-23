

public class dulicate_element {
    public static void main(String[] args) {
        int arr[]= {2,3,43,1,1,1,2,5,55,3,2,43};
        int arr1 [] = new int [arr.length];
        int k = 0;

        for(int i = 0;i<arr.length-1;i++){
            for(int j = i+1;j<arr.length;j++){
                if(isNotPresent(arr1, arr[i])){
                if(arr[i]==arr[j]){

                    System.out.println(arr[i]);

                    arr1[k] = arr[i];
                    k++;
                    
                }
            }
            }
        }




    }
    public static boolean isNotPresent(int arr1[], int key){
        for(int x:arr1){
            if(x==key){
                return false;
            }
        }
        return true;








    }
}
