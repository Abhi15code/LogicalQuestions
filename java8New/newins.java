package java8New;

public class newins {

    public static void main(String[] args) {
        singleton sin = singleton.getsingle();
        sin.show("abhishek", "deepak", "Rahul");
        
        
    }
    
}


 class singleton {


    
    private singleton() {
    }

    static singleton sin = null;
    static {
        sin = new singleton();

    }

    public static singleton getsingle() {
        System.out.println("this is get singleton method");
        return sin;
    }

    public static String show(String... argss) {

        System.out.println("this is show method inside singlton method");

            for(String x: argss){

                System.out.println(x);
            }


        return "successfull....";

    }
}
