package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastitr2 {
    public static void main(String[] args) {
        // List <String> ls = new ArrayList<>();
        // ls.add("abhishek");
        // ls.add("Ankur");
        // ls.add("anand");
        // ls.add("Rahul");
        // ls.add("Arjun");

        // Iterator<String> itr = ls.iterator();
        // while(itr.hasNext()){
        //     if((String)itr.next()=="Ankur"){

        //         ls.remove("Arjun");
        //     }
        // }
        // System.out.println(ls);
        ArrayList<String> students = new ArrayList<String>();   
        students.add("Emma");   
        students.add("Paul");   
        students.add("Walker");  
        students.add("Elanie");  
        students.add("Amara");  
          
          
        //creating an instance of the Iterator class  
        Iterator itr = students.iterator();   
          
        //iterating ArrayList using Iterator   
        while (itr.hasNext()) {  
            if ((String)itr.next() == "Paul")   
                // It will not throw an exception   
                students.remove("Amara");  
        }  
          
        System.out.println(students);  
    }
}
