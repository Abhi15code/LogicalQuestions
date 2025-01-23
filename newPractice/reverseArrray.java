package newPractice;

public class reverseArrray {
    public static void main(String[] args) {
        int[] arr= {23,124,1,41,89};

     int  left = 0;
     int right= arr.length-1;
     while(right>left)
{
    int temp = arr[left];
    arr[left] = arr[right];
    arr[right] = temp;

    left ++;
    right --;

}    

for(int x : arr){
    System.out.print(x+" | ");
}
      
    }

    
}
