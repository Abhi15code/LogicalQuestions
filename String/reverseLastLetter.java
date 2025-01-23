package String;

public class reverseLastLetter {
        
    public static void main(String[] args) {
        String str = "Ankur singh";
        char ch[] = str.toCharArray();

        String rev = "";
        char temp =' ';
       
        for(int i = ch.length-1;i>=0;i--){
            if(i==ch.length-1){
                 temp = ch[i];
            }
            else{
                rev = rev+ch[i];
            }
        }
        rev = rev+temp;
        System.out.println(rev);
    }
}
