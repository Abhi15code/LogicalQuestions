package Exceptions;

public class Exception1 {
    public static void main(String[] args) 
    {
        try {
            Class.forName("Ab");
        } catch (Exception e) {
            e.printStackTrace();
        }

       
    }
    
}

class Ab{
    public static void m2(){
        System.out.println("this is m2");
    }
    static{
        System.out.println("this is static block");
    }
}
