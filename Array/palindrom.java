public class palindrom {
   
    public static void main(String[] args) {
        int num=465564;
        int pal=0;
        int temp = num;
        while(num>0){
            int rem = num%10;
            pal = pal*10+rem;
            num=num/10;
        }
        if(pal==temp){
            System.out.println("it is palindrom");
        }
        else{
            System.out.println("it is not a palindrom");
        }

    }
}
