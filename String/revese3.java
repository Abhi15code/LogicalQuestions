package String;

public class revese3 {
    public static void main(String[] args) {
        String st = "Hello how are you ";
        String reverse = "";

        String s [] = st.split(" ");
    //     String str[] = new String[s.length];
    //     int k = 0;


    //    for(int i = s.length-1;i>=0;i--){
    //     str[k] = s[i];
    //     k++;
    //    }

    //    for(String ss :str){
    //     System.out.print(ss+" ");
    //    }


    
    for(int i = s.length-1;i>=0;i--){
        reverse = reverse+ s[i]+" ";
    }

    System.out.println(reverse);

    }

}
