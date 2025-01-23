package java8_documents;

public class RunnableDemo {
    public static void main(String[] args) {
        Runnable r = ()->{
            for(int i = 0;i<10;i++){
                System.out.println("run method Runnable(Chile Thread)");
            }
        };
        Thread t1 = new Thread(r);
        t1.start();
        for(int i = 0;i<10;i++){
            System.out.println("Main Thread");
        }
    }
}
