package newPractice;

public class reverseArray {
    public static void main(String[] args) {
        int arr[]={23,13,5,22,53,1,98};
        // int arr1[] = new int[arr.length];
        // int k =0;
        // for(int i = arr.length-1;i>=0;i--){
        //     arr1[k]=arr[i];
        //     k++;

        // }
        // for (int i : arr1) {
        //     System.out.println(i);
        // }
        int left =0;
        int right = arr.length-1;
        while(left<right){
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] =temp;
            left ++;
            right--;
        }
        for(int x: arr){
            System.out.println(x);
        }
    }
}
