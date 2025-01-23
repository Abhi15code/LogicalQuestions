package flat;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartData {
    public static List<Customer> getAllcustomer() {
        return Stream.of(
                new Customer("Bob Smith", "bob.smith@example.com", Arrays.asList("555-8765", "555-4321")),
                new Customer("Charlie Brown", "charlie.brown@example.com", Arrays.asList("555-1111", "555-2222")),
                new Customer("Diana Prince", "diana.prince@example.com", Arrays.asList("555-3333", "555-4444")),
                new Customer("Ethan Hunt", "ethan.hunt@example.com", Arrays.asList("555-5555", "555-6666")),
                new Customer("Fiona Apple", "fiona.apple@example.com", Arrays.asList("555-7777", "555-8888")),
                new Customer("George Martin", "george.martin@example.com", Arrays.asList("555-9999", "555-0000")),
                new Customer("Hannah Montana", "hannah.montana@example.com", Arrays.asList("555-1010", "555-2020")),
                new Customer("Ian McKellen", "ian.mckellen@example.com", Arrays.asList("555-3030", "555-4040")),
                new Customer("Judy Garland", "judy.garland@example.com", Arrays.asList("555-5050", "555-6060")))
                .collect(Collectors.toList());
    }
}
