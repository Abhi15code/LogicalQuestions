package newPractice;

public class prime {
        public static boolean isPrime(int n){
          int divisionCount = 0;
          for(int i = 1;i<=n;i++){
            if(n%i == 0 ){
                divisionCount++;

            }
            
          }
          if(divisionCount==2){
            return true;
          }
            else{
            return false;
            
          }
        }
        public static void main(String args[]){
          boolean bb =  isPrime(6);
            System.out.println(bb);
        }
}
