package newPractice;

public class maxInArray {
    public static void main(String[] args) {
        int arr[] = {12,41,53,55,119};
        int max = Integer.MIN_VALUE;
        for(int x : arr){
            if(x>max){
                max = x;
            }
        }
        System.out.println(max);

        int arr1[] = {32,52,6,233,62,5};
        for(int i =0;i<arr1.length-1;i++){
            for(int j =i+1;j<arr1.length;j++){
                if(arr1[i]>arr1[j]){
                    int temp = arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]= temp;

                }
            }
        }
        int max2 = arr1[arr1.length-1];
        System.out.println(max2);
    }

}
