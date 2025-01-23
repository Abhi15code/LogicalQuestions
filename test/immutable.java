
package test;
final class createimmutable{
    private int n ;
    createimmutable(int n){
        this.n = n;

    }
    public createimmutable mofify(int n){
        if(this.n == n){
            return this;
        }
        else{
            return (new createimmutable(n));
        }

    }
}
public class immutable {
    public static void main(String[] args) {
        createimmutable c1 = new createimmutable(100);
        createimmutable c2 = c1.mofify(10);
        System.out.println(c1==c2);
        createimmutable c3= c1.mofify(101);
        System.out.println(c1==c3);
    }
}
