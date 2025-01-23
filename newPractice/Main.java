package newPractice;

public class Main {
    public static void main(String[] args) {
        String name = "Abhishek";
        String rev = "";
        for(int i=name.length()-1;i>=0;i-- ){
            char c = name.charAt(i);

            rev = rev+c;
            
        }
        System.out.println(rev);
        
        char c[] = name.toCharArray();

        String rev2 = "";

        for(int i = c.length-1;i>=0;i--){
            rev2 = rev2+c[i];
        }

        System.out.println(rev2);

        String name2 = "ABHISHEK";
        char c2[]  = name.toCharArray();
         String vow = "";
         for(int i = 0;i<c.length;i++){
             if(c[i] == 'A' || c[i] == 'E' || c[i]== 'I'|| c[i] == 'O'|| c[i] == 'U'){
                 vow = vow+c2[i];
                }
                 
             }
             System.out.println(vow);

             System.out.println(Main.removeVowel("VED prakash"));
    }

    public static String removeVowel(String str){
      return  str.replaceAll("[AEIOUaeiou]", "");
    }
}
