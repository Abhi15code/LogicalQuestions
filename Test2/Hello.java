
 class singleton{
     static int ab = 23;
    private singleton(){}
     static singleton sin = null;
    static {
        sin = new singleton();
    }
    public static singleton getSingle(){
        return sin;
    }
    public void show(){
        System.out.println("this is show method");
        System.out.println(ab);


    }
}

public class Hello {
    
    public static void main(String[] args) {

        
        Thread th = new Thread(()-> {
            for(int i = 0;i<10;i++){
                System.out.println("created Thread mini");
            }
        });


        th.start();
        for(int j =0;j<=10;j++){
            System.out.println("main Thread");
        }
        singleton sin1 = singleton.getSingle();
        sin1.show();
       
    }


}
