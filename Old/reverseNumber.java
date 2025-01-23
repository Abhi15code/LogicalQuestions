package Old;

public class reverseNumber {
    public static void main(String[] args) {
        
        int n = 143;
        int result=0;
       
        while(n>0){
            int rem = n%10;
            result = result *10+rem;
            n = n/10;
        }
        System.err.println(result);

       int x= reverseNum(2324);
       System.out.println("This is reverse Number "+x);
    }

    public static int reverseNum(int num){
        String str = new String().valueOf(num);
        StringBuilder sb = new StringBuilder(str);
      str =  sb.reverse().toString();
        int rev =Integer.valueOf(str);
        return rev;



    }
}
