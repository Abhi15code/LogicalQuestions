package memory;
interface dba{
    public void ab(int a, int b, int count );
}
class Helo{
    
}
public class oop {
        public static void main(String[] args) {
            
           // int next ;
            
            dba db = ( int a,int b  , int count)->{
                int sum = 1;
                for(int i =1;i<=count;i++){
                    sum= a+b;
                    System.out.print(sum+" ");
                    a=b;
                    b = sum;
                    
                }
            };
            db.ab(0,1 , 10);
        }
}
