package collection;
class He{
    int a = 20;
    static int num = 200;
    int Static = 2020;
    
   // final int b;

    static final int ab ;
    static{
       // b = 21;
        ab = 233;
       // static int abc = 200;

    }

    public void show(){
        System.out.println(a);
        System.out.println();
    }
}



public class neww {
    public static void main(String[] args) {
        He h = new He();
        System.out.println(h.ab);
    }
}
