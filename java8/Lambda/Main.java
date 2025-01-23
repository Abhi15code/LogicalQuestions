package java8.Lambda;
 interface operation {
public void feb(int start , int end , int count);
    
}

public class Main{
    public static void main(String[] args) {
        
        operation op = (int start, int end, int count)->{

                    int result = 1;
                    for(int i = 1;i<=count;i++){
                            result = start + end;

                            System.out.print(result+" ");
                            start = end;
                            end = result;


                    }

        };  
        op.feb(0,1,10);
                    


    }
}