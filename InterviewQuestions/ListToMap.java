package InterviewQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import java8.eight;

class Employee {
    private String name;
    private int eid;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public Employee(int eid, String name) {
        this.name = name;
        this.eid = eid;
    }

}

public class ListToMap {
    public static void main(String[] args) {
        List<Employee> emplst = new ArrayList<>();
        Map<Employee,Long> newls=	emplst.stream().collect(Collectors.groupingBy(Function.identity() , Collectors. counting()));		


        emplst.add(new Employee(101, "abhishek"));
        emplst.add(new Employee(202, "deepak"));
        emplst.add(new Employee(303, "shahid"));
        emplst.add(new Employee(404, "NOT found"));

        Map<Integer, String> empmap = new HashMap<>();

            System.out.println("By simple for loop");
        for(Employee em : emplst){
            empmap.put(em.getEid(), em.getName());
        }

        System.out.println("Map" + empmap);

        // 2. to convert list to map we can use Collectors.tomap

        // LinkedHashMap<Integer, String> NewMap = emplst.stream()
        //         .collect(Collectors.toMap(Employee::getEid, Employee::getName,
        //                 (x, y) -> x + " ," + y, LinkedHashMap::new

        //         ));
        //        System.out.println(NewMap);
               

            System.out.println("with Java8");
            Map<Integer , String> newmaplst = emplst.stream().collect(Collectors.toMap(Employee::getEid, Employee::getName));
            System.out.println(newmaplst);
      
    }

}
