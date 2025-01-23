package java8_documents;

import java.util.*;

class A {
    int a = 10;
}

public class Demoo extends A {

    public void show() {
        System.out.println("show method");
        System.out.println(super.a);
    }

    public static void main(String[] args) {

        Demoo d = new Demoo();
        d.show();

        List<String> st = new ArrayList<>();
        st.add("Abhishek");
        st.add("Deepak");
        st.add("Abhishek");

        st.add("pooja") ;
        st.add("pooooo");

        Collections.unmodifiableList(st);




        for(String s : st){

            System.out.println(s);
           
        }
        st.add("rk");
        System.out.println(st);
    }

}
