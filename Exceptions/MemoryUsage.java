package Exceptions;

public class MemoryUsage {
        public static void main(String[] args) {

            Runtime rt = Runtime.getRuntime();
            Long startMemory= rt.totalMemory()-rt.freeMemory();

            for(int i=0;i<=34;i++){
                try{
                    if(i>2){
                        int num = i/0;
                    }
                    else{
                        System.out.println(i);
                    }
                }catch(Exception e){
                    System.out.println("Exception caught");
                }
                
            }
            Long endMemory = rt.totalMemory()-rt.freeMemory();
                System.out.println("Memory Usage==> "+ (endMemory-startMemory));

                System.out.println(1==1);
                Integer a = 127;
                System.out.println(System.identityHashCode(a));
                Integer b = 127;
                System.out.println(System.identityHashCode(b));
                System.out.println( a==b);
        }
}
