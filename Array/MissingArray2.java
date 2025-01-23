public class MissingArray2 {
    public static void main(String[] args) {
      int n = 10;
      int divisioncount = 0;

      for(int i = 1;i<=n; i++){
        if(n%i==0){
            divisioncount++;
            
        }
      
        
      }
      
      
      
      System.out.println(divisioncount);
      if(divisioncount==2){
        System.out.println("this is prime");
      }
      else{
        System.out.println("this is not prime");
      }

    }
}
