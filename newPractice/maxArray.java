package newPractice;

public class maxArray {

    public static void main(String[] args) {
        int arr[] = {23,41,34,11,3,98,1};
        int max = Integer.MIN_VALUE;

    for(int x:arr){
        if(x>max)
        max = x;

        
    }
    System.out.println(max);
    }
}
