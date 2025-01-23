package Old;

public class reverseString {
    public static void main(String[] args) {
        
        String st = "Abhishek kumar";
        char ch[] = st.toCharArray();

        int left = 0;
        int right = ch.length-1;
        while(left<right){
            char temp = ch[right];
            ch[right] = ch[left];
            ch[left]=temp;
            left++;
            right--;
        }
        System.out.println(ch);
    }
    
}
