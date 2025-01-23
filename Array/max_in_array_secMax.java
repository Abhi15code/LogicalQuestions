public class max_in_array_secMax{
public static void main(String[] args) {
        int arr[] = {23,1,34,5,6,77,34,11111,9, 99};
        int max = Integer.MIN_VALUE;
        int sec_max = Integer.MIN_VALUE;

        for(int  i: arr){
            if(i>max ){
            sec_max=max;
            max=i;
            }
            if(i<max && i>sec_max){
                sec_max = i;
            }
        }
        System.out.println(max);
        System.out.println("Second max "+sec_max);




}
}