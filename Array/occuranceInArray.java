public class occuranceInArray {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 2, 5, 3, 4, 5 };
        int arr2[] = new int[arr.length];
        int k = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            int count = 1;
            if (isNotPresent(arr2, arr[i])) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        arr2[k] = arr[i];
                        k++;
                    }
                }
                System.out.println(arr[i] + " => " + count);
            }
        }
    }

    public static boolean isNotPresent(int arr[], int key) {
        for (int x : arr) {
            if (x == key)
                return false;
        }
        return true;
        
    }
}
