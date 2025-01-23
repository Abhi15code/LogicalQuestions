package Old;

public class sum_of_allDigit {
public static void main(String[] args) {

    int n =457; //19 . 10 . 1
    // int n = Integer.MAX_VALUE;
    int x = sumFind(n);
    System.out.println(x);
    
}

public static int sumFind(int n ){
    int sum = 0;
    while(n!=0){
        
        int r = n%10;
        sum = sum + r;
        n  = n/10;

    }

    // at this place we use recursion if we want  that our sum will continue until it's become single digit
    // so we call this method again and again until number sum become single digit or we can say sum until single digit less than 10

    while(sum>=10){
        sum = sumFind(sum);
    }
    return sum;
}




    
}
