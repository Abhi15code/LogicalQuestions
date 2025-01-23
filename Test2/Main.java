
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

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

}

public class Main {
    public void print(Integer i) {
        System.out.println("Integer");
    }

    public void print(int i) {
        System.out.println("int");
    }

    public void print(long i) {
        System.out.println("long");
    }

    public void print(int... i) {
        System.out.println("int...");
    }

    public static void main(String[] args) {

        new Main().print(10);
        String s = new String("5");
        System.out.println(1 + 0 + s + 1 + 10);
        System.out.println("Hello this is test1");

        List<Employee> list = Arrays.asList(
                new Employee(1, "ABhishek kumar", "IT", 50000d),
                new Employee(3, "deepak", "HRD", 40000d),
                new Employee(4, "sohan das", "ART", 30000d),
                new Employee(2, "anand yadav", "OT", 20000d));
        // list.stream().map(emp -> emp.getSalary() + (emp.getSalary() * 0.10)).forEach(System.out::println);

        list.stream().map(emp->emp.getName()).sorted(Comparator.comparing(String::length)).forEach(System.out::println);
    
       
    }

}
