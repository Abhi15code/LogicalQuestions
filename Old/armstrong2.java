package Old;

public class armstrong2 {
    public static void main(String[] args) {
        int num =1634;
        int org =  num;
        int temp = num;
        int result = 1;
        // System.out.println(temp);
      
        int count=0;
        int sum = 0;
        while(num>0){
          
            count++;
            num = num/10;
        }
        System.out.println(count);

        while(temp>0){
            int rem = temp%10;

            int base = rem;
            int power =  count;
            

            for(int i = 1;i<=power;i++){
                result  = result*base;
                
            }
            sum = sum+result;
            temp = temp/10;

        }
        System.out.println(sum);
        if(sum==org)
        System.out.println("done");
        else
        System.out.println("not done");
    }
}
