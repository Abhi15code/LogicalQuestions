package String;

public class reverse4 {
    public static void main(String[] args) {
        String str = "Hello how are you abhishek";
        String s[] = str.split(" ");
        String rev="";
        for(int i = 0;i<s.length;i++){
            if(i==s.length-1){
                String reverse = "";
                for(int j=s[i].length()-1;j>=0;j--){
                 reverse = reverse+s[i].charAt(j);
                  
                }
                rev = rev+reverse;
            }else{
                rev = rev+s[i]+" ";
            }
        }
        System.out.println(rev);
    }
}
