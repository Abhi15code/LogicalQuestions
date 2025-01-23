package emp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        System.out.println("Hello this is toString");
        return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
      
    }
    
}
public class Main {
    public static void main(String[] args) {
           List<Employee> list = Arrays.asList(
                new Employee(1, "Abhishek kumar", "IT", 50000d),
                new Employee(3, "deepak", "HRD", 40000d),
                new Employee(4, "sohan das", "ART", 30000d),
                new Employee(2, "anand yadav", "OT", 2980000d));
        // list.stream().map(emp -> emp.getSalary() + (emp.getSalary() * 0.10)).forEach(System.out::println);

        
        // list.stream().map(emp->emp.getSalary()).sorted(Comparator.comparing(o-> o>20).forEach(System.out::println);

            System.out.println("Hello this is abhishek kumar");
            
            Employee emp  = new Employee(291, "Abhishek kumar", "HR", 78000d);
                

            System.out.println(emp);
            

        //    String greet = "Hello this is abhishek kumar from nothing and as you know my name is abhishek that means i'm a hindu so what it means to be a hindu that's means i'm a part of this hindu community what's the point of all of this why am i hindu do i need to be hindu or any religon and this ";
        //   Map<String ,Long> newls =  Arrays.stream(greet.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        //   System.out.println(newls);


        //   Arrays.stream(greet.split(" ")).sorted(Comparator.comparing(String::length)).
        //   collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).
        //   entrySet().stream().filter(str->str.getValue()==1).map(str->str.getKey()).
        //   forEach(System.out::println);;


        Runnable  reverse = ()->{
            
          String str = "Hello this is abhishek";
          String str2[] =  str.split(" ");
        
          String rev2 = "";
  
            for(int i = 0;i<=str2.length-1;i++){
              String rev = "";
              for(int j = str2[i].length()-1;j>=0;j--){
                  
                rev = rev+  str2[i].charAt(j);
  
              }
              rev2 = rev2+rev+" ";
  
  
            }
            System.out.println(rev2);

             
        };
        reverse.run();

        Runnable charfreq=()->{   
            String sample1 = "Hello this is abhishek kumat";

           Map<Character , Long> charfre  = sample1.chars().mapToObj(c->(char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
           System.out.println(charfre);


        };

        charfreq.run();
          
            
    }   


    
}
