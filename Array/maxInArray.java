public class maxInArray {
public static void main(String[] args) {
    int arr[]= {2,3,53,34,6,22,33333,3};
    
    int max= Integer.MIN_VALUE;
    for(int x : arr){
        if(x>max){
            max = x;
        }
    }
    System.out.println(max);
}

    
}
