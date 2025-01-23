package newPractice;
final class employee{
    private final String name;
    private final int age;
    private final Adress adress;

    employee(String name, int age , Adress adress){
        this.name = name;
        this.age  = age;
        this.adress = adress;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
    public Adress getAdress(){
        return adress;
    }
}
final class Adress{
    private final String street;
    private final String city;
    private final String state;
    private final String zip;

    Adress(String street , String city, String state, String zip){
        this.street=street;
        this.city =city;
        this.state=state;
        this.zip = zip;
    }

    public String getStreet(){
        return street;
    }
    public String getCity(){
        return city;
    }
    public String state(){
        return state;

    }
    public String zip(){
        return zip;
    }
    public String toString(){
        return "this is toString ";

    }
}
public class immute {
    public static void main(String[] args) {
        Adress ad = new Adress("new", "noida", "up", "462010");
            employee emp = new employee("Abhishek", 32, ad);

            System.out.println(emp.getAdress());

    }

}
