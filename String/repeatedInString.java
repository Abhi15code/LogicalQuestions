package String;

public class repeatedInString {
    public static void main(String[] args) {
        String str  = "aabhisheks";
        char chr[] = str.toCharArray();
        char chr2[] = new char [chr.length];
        int k = 0;
        for(int i = 0;i<chr.length-1;i++){
            for(int j = i+1;j<chr.length;j++){
                if(chr[i]==chr[j]){
                    chr2[k] =chr[i];
                    k++;
                }
            }
        }

        // String st = chr2.toString();
     for(char x:chr2){
       System.out.println(x);
     }  
    }
}
