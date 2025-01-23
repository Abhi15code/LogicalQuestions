package java8;

import java.util.Optional;

public class optionalClass {
public static void main(String[] args) {
    
    String str = "Hello world";
    Optional<String> option = Optional.ofNullable(str);

    if(option.isPresent()){
        System.out.println(option.get().toUpperCase());
    }
    option.ifPresent(input->System.out.println(input.toUpperCase()));
    option.filter(s->s.contains(str));


    
    
}
   
    
}
