package Old;

public class ArraySortBubble {
    public static void main(String[] args) {
        
        int arr[]={3232,1,3,2,5,6,2,7};
        for(int i = 0;i<arr.length-1;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            // System.out.println(arr[i]);
        }
        for(int x:arr){
            System.out.println(x);
        }
    }
}
