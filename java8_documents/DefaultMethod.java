package java8_documents;

interface up   {
    public default  void m1(){
        System.out.println("M1 in up");
    }
    public default void demo(){
        System.out.println("this is Demo method");
    }
    
}
interface down {
    public default void m1(){
        System.out.println("m1 in down");
    }
    static void staticMethod(){
        System.out.println(
            "down static method inside down interface"
        );
    }
    
}
public class DefaultMethod implements up, down{
    public void m1(){
        System.out.println("m1 in class");
        down.super.m1();
        up.super.m1();
    }

    public void staticMethod(){
        System.out.println("this is static method inside class");
    }
    public static void main(String[] args) {
        

            DefaultMethod d = new DefaultMethod();
            d.m1();
            d.demo();
            // d.staticMethod

            down.staticMethod();
            d.staticMethod(); 
    }
}
