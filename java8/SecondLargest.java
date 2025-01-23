package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Users{
    int id;
    String name;
    Double salary;
    public Users(int id, String name,Double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;

        
    }
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
    public Double getSalary() {
        return salary;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Users [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
    
}
public class SecondLargest {
    public static void main(String[] args) {
        List<Users> UserList = new ArrayList<>();
        UserList.add(new Users(101, "abhishek", 32222d));
        UserList.add(new Users(102, "Ankur", 5321d));
        UserList.add(new Users(10, "abhishek", 88932d));
        UserList.add(new Users(104, "abhishek", 2612d));
        UserList.add(new Users(202, "Anand", 7878787d));

        List<Users> uL2 = UserList.stream().sorted(Comparator.comparing(Users::getSalary) .reversed()).collect(Collectors.toList());
            uL2.stream().skip(1).limit(1).forEach(s->System.out.println(s));
            System.out.println("*****");
            for(Users  l:uL2){
                System.out.println(l);

            }
    
    }

}
