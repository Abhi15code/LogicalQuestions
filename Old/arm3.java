package Old;

public class arm3 {
    public static void main(String[] args) {
        int n = 1634;
        int temp = n;
        int org = n;
        int sum = 0;
       
        int count=0;

        // first step to count the number and find the power 

        while(n>0){
            count++;
            n = n/10;
        }
        System.out.println(count);

        // now we perform the final step

        while (temp>0){
            int rem = temp%10;
            int base = rem;
            int power = count;
            int rs = 1;
            
            

            for(int i = 1;i<=power;i++){
                rs = rs * base;
            }

            sum = rs + sum;
            temp = temp/10;
        }
        System.out.println(sum);

        if(sum == org){
            System.out.println("done...");
        }
        else{
            System.out.println("not done");
        }
    }
    
}
