package MultiThreading;
class Thread1 extends Thread{
@Override
public void run(){
    System.out.println("inside run method");
    System.out.println("Thread Name " + currentThread().getName());
    System.out.println("Priority of Thread " +currentThread().getPriority());
    System.out.println("Thread Group name  " +currentThread().getThreadGroup().getName());
    

}

}
public class userDefine {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
       
        t1.setName("Thread xxx");
        t1.setPriority(3);
        t1.start();
        System.out.println(t1);
    }

}
