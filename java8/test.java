package java8;

public class test {
        public static void main(String[] args) {
            int ab[]  = new int[105];
            for(int i =1;i<=ab.length;i++)
            {
                ab[i-1]=i;
            }
            for(int x: ab ){
                System.out.println(x);
            }
        }
}
