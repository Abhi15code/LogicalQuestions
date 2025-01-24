class single{
    private static single instance=null;
    private single(){}
    public static single getInstance(){
        if(instance==null){
            synchronized(single.class){
                if(instance==null){
                    instance=new single();
                }
            }
           
        }
        return instance;

    }
}
public class SingleTonThreadSafe{
    public static void main(String[] args) {
        single s1=single.getInstance();
        single s2=single.getInstance();
        System.out.println(s1==s2);
        System.out.println("Hello this is thread safe single ton class  ");
        

        


    }


}