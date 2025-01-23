package String;

public class Toggle {
    public static void main(String[] args) {
        Integer intt = null;
        intt = 2933;
        System.out.println(intt);


        String str = "Abhishek&&&&";
        char ch[] = str.toCharArray();
        String tg = "";

        for(char c: ch){
            if((c>='A') &&( c<='Z')){
                char c1 =(char) (c+32);
                tg = tg+c1;
            }
            else if(c>='a' && c<='z'){
                char c2 = (char) (c-32);
                tg = tg+c2;

                }
            
            else{
                tg = tg+c;


            }
        }   
            System.out.println(tg);

    }
}

