package newPractice;

public class fbonoccy {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        int range =10;
        for(int i =1;i<=range;i++){
            int next = n1+n2;
            System.out.println(next+" ");
            n1=n2;
            n2=next;

        }

    }
    
}
