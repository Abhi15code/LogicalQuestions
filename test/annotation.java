package test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
 @interface HelloThis{

}



@HelloThis
class HelloAnno{
    public void m1(){
        System.out.println("this is m1 method");
    }

}

class Dog{

}

public class annotation {
    public static void main(String[] args) {
        HelloAnno h1 = new HelloAnno();
        if(h1.getClass().isAnnotationPresent(HelloThis.class)){
            System.out.println("this class is annotated");
        }
        else{
            System.out.println("not annotated ");
        }
        
        Dog d1 = new Dog();
        if(d1.getClass().isAnnotationPresent(HelloThis.class)){
            System.out.println("annotated with @Hellothis");
        }
        else{
            System.out.println("not annotated with @Hellothis");
        }

    }
}
