package String;

public class Reverse {
    public static void main(String[] args) {
        String str= "Abhishek";
      //  char ch [] = str.toCharArray();

        String rev = "";
        for(int i = str.length()-1;i>=0;i--){
            char c = str.charAt(i);
            rev = rev+c;

        }

        System.out.println(str +  " Reverse => " + rev);
       
    
       

    }
}
