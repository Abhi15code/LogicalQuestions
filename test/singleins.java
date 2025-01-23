package test;

class single1{
    String msg = "Hello i'm abishek kumar ";

    static single1 si = null;
    private single1(){

    }
    static{
        si = new single1();

    }
    public static single1 getsingle(){
        return si;
    }
    public void show(){
        System.out.println("this is show method     ");
        System.out.println("Msg::: " +msg);
    }
}
public class singleins {
    public static void main(String[] args) {
        System.out.println("this is main method");
        single1 si1 = single1.getsingle();
        single1 si2 = single1.getsingle();
        System.out.println(si1==si2);
        si2.show();
    }

}
