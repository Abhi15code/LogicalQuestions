package test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Test{
    private final String name;
    private String age;


    public Test(String name, String age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }


    public String getAge() {
        return age;
    }


    public void setAge(String age) {
        this.age = age;
    }

    
    public void void_method(){

    }
    private void privateMethod(){
        System.out.println("THIS IS PRIVATE METHOD  ");
    }

    

}

public class Rflectionxx {
public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Test test = new Test("abhishek", "22");

       Field field []=  test.getClass().getFields();
       
       for(Field x : field){
        System.out.println(x.getName());
       }

      Method methods[] =  test.getClass().getDeclaredMethods();
      for(Method method: methods){
        // System.out.println(method);
        if(method.getName().equals("privateMethod")){
            method.setAccessible(true);
            method.invoke(test);

           
        }
       
      }


}
}
