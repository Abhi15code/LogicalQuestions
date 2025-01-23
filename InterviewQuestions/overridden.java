package InterviewQuestions;
class hai{
    int a = 234;

    hai(){}
    hai(int a){
        System.out.println("one para cons");
    }

    public void over(String msg){
System.out.println("hai   "+ msg);
    }
}
class hel extends hai{
    int b=32;
    
    hel(){
        super(83);
        System.out.println(super.a);
    }
    public void over(String msg){
        
        System.out.println("hel "+msg);
        System.out.println(super.a);

    }
}
public class overridden {
    public static void main(String[] args) {
        hai h = new hel();
        h.over("Abhishek");
        System.out.println();


    }
    
    
}
