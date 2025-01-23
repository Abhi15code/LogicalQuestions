package java8;

import java.util.Optional;

public class optional2 {
    public static void main(String[] args) {
        System.out.println("main method");
        Optional<String> op2 =  Optional.ofNullable("Hai this is ofNullable");
        System.out.println(op2);
        if(op2.isPresent()){
            System.out.println(op2.get());
        }
        else{
            System.out.println("no value inside it");
        }
        System.out.println("***************");
        op2.ifPresent(val->System.out.println(val.toUpperCase()));
    }
    
}
