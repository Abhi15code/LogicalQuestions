package java8_documents;

 interface Innerdemo {
    public int m1(int a, int b);
    
}
public class demo {
    public static void main(String[] args) {
         
        Innerdemo id = (a, b)->{
            // System.out.println(a*b);
            System.out.println("this is Lambda implementation ");
            return a*b;

        };
      int a =   id.m1(10, 20);
      System.out.println(a);

    }
    
}
