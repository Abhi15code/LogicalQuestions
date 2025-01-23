public class SecondMax {
    public static void main(String[] args) {
        int arr[] = {23,3,2,3,55,545,80};
        int max = Integer.MIN_VALUE;
        int sec_max = Integer.MIN_VALUE;

        for(int a : arr){
           if(a>max){
            sec_max = max;
            max = a;
           }

           if(a<max && a>sec_max ){
            sec_max = a;
           }
    
        }


        System.out.println("Max..:: "+max);
        System.out.println("SecondMax..::"+sec_max);
    }
}
