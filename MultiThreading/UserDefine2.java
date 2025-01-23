package MultiThreading;
class Runn implements Runnable{
    public void run(){
        System.out.println("inside run method");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getThreadGroup().getName());
    }
    // public Runn(){
    //     Thread t1 =  new Thread(this);
    //     t1.start();
    // }

}
public class UserDefine2 {
    public static void main(String[] args) {
        Runn r1 = new Runn();
        
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread (r1, "Thread xx ");
        ThreadGroup tg = new ThreadGroup("TG_01");
        Thread t3  = new Thread (tg,r1, "Thread yy" );
        t3.start();
        t2.start();
        t1.start();
    }
    
}
