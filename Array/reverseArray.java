

public class reverseArray {
    public static void main(String[] args) {
        int arr[]  = {23,2,5,77,734,23,2,1 };
        System.out.println("Before reverse ");
        for(int i = 0;i<arr.length-1;i++)
        {
            System.out.print(arr[i]+" ");
        }
        int left = 0;
        int right = arr.length-1;
        while (left<right) {
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left]= temp;
            left++;
            right--;

        }
        System.err.println();
        System.out.println("After reverse");
        for(int x: arr ){
            System.out.print(x+" ");
        }

    } 
}
