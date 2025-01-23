package Old;

public class pattern1 {
    public static void main(String[] args) {
        

        for(int i = 5;i>=1;i=i-1){
            for(int j = 1;j<=5-i;j++){


                System.out.print(" ");
            
            }
            for(int j = 0;j<2*i-1;j++)
            System.out.print("*");
            
        
        System.out.println();
        }
    }    

}
