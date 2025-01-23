package Old;

public class perfectNumber2 {
    public static void main(String[] args) {
        int n = 7;
    int fsum = 0;
    for(int i =1;i<n;i++){
        if(n%i==0){
            fsum=fsum+i;

        }

    }
    if(n==fsum){
        System.out.println("perfect");
    }
    else{
        System.out.println("not perfect");
    }
    }
}

