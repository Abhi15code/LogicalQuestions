package flat;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    
    public static void main(String[] args) {
        List<Customer> custlst = EkartData.getAllcustomer();

            // this is the traditional map method which which works as data transfer
            // List<Customer> -> List<String> ==  data Transfer
        // email.getEmail() - > one to one mapping
              List<String> email =   custlst.stream().map(customer-> customer.getEmail()).collect(Collectors.toList());
        System.out.println(email);

        // one to many mapping
        //
     List< List<String>> phone =  custlst.stream().map(cust->cust.getPhone()).collect(Collectors.toList());
     System.out.println(phone);


     //  // List<Customer> -> List<String> ==  data Transfer
        // cust.getPhone - > one to many mapping
                 List<String>  phones =  custlst.stream().flatMap(cust->cust.getPhone().stream()).collect(Collectors.toList());
            System.out.println(phones);

    }
}
