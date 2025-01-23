package Old;

public class armstrong {




    public static boolean checkArmstrong(int num){


        
        //this method is also right but the problum with this is to we can only find 3 digit armstrong number which is not a good solution
        

        // while(num>0){
        //     int rem =num%10;
        //         result = result+(rem*rem*rem);
        //         num = num/10;
        // }

        // System.out.println(result);

        
       int result = 0;
        int count = 0;
        int temp = num;
        int sum=0;
        int rs =1;

        while (temp > 0) {
            temp = temp /10;
            count++;
        }
        temp = num;
        while (temp > 0) {
            int rem = temp % 10;
             result += (Math.pow(rem, count));            
            temp = temp / 10;
            // int base =rem;
            // int power = count;
           
            // for(int i = 0;i<power;i++){
            //     rs = rs*base;

            // }
            // rs  = rs+sum;
            // temp = temp/10;

        }
        
        if(result==num)
        return true;
        else
        return false;


    }
    public static void main(String[] args) {
      
       boolean b = checkArmstrong(123);
        System.out.println(b);



    }
}
