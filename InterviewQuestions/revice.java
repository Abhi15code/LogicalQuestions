package InterviewQuestions;

interface i {
    int a = 2000;

    public void iM();

    public static void staticMethod() {
        System.out.println("this is static method");
        System.out.println(a);
    }

    class innerr{
        int a  = 393;
        public void innerM1(){
            System.out.println("this is the inner method inside the inner class inside interface ");
        }
    }
}

abstract class Heloo {
    public void show() {
        System.out.println("this is show method with some code inside it");
    }

    public void hel() {
        System.out.println("this is hel method");
    }

    public static void m1() {
        System.out.println("this is static method inside heloo");
    }

    abstract public int method2(int a, int b);
}

class hev extends Heloo implements i {
    public void m11() {
        System.out.println("this is m1 method");
    }

    public void iM() {
        System.out.println("this is im method from interface i");
    }

    public void me() {

    }

    public int method2(int a, int b) {
        return a * b;
    }
}

public class revice {
    public static void main(String[] args) {
        hev h = new hev();

        int a = h.method2(10, 29);
        System.out.println(a);

        Heloo h2 = new hev();
        h2.show();

        h.iM();

        i.innerr i1 = new i.innerr();
        System.out.println(i1.a);
        i1.innerM1();
        

    }

    public void m2() {
        final int ab = 30;

    }
}
