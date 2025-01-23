package collection;

public class Palindrom {
    public static void main(String[] args) {
        String name = "";
        String sanitized = name.replaceAll("\\s+", "").toLowerCase();
        System.out.println(sanitized);

       // boolean bb = ispalindrom("solo");
    //    System.out.println(bb);

        if (isPalindrome(sanitized)) {
            System.out.println(name + " is a palindrome.");
        } else {
            System.out.println(name + " is not a palindrome.");
        }
    }
    public static boolean isPalindrome(String name){
        int left = 0;
        int right = name.length()-1;

        while(left<right){
            if(name.charAt(left) != name.charAt(right)){
                return false;

            }
            left ++;
            right --;
           
        }
        return true;

    }
}
