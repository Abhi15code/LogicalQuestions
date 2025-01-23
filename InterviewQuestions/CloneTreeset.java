package InterviewQuestions;

import java.util.TreeSet;

public class CloneTreeset {
    public static void main(String[] args) {
        TreeSet<String> fruits = new TreeSet<>();
        fruits.add("banana");
        fruits.add("pineApple");
        fruits.add("Apple");
        fruits.add("peech");
        fruits.add("Cheeku");
        // System.out.println(fruits);
        // TreeSet<String> Clonefruits = (TreeSet<String> )fruits.clone();
        // System.out.println("Cloned " + Clonefruits);

        // fruits.stream().forEach(System.out::println);

        fruits.stream().forEach(System.out::println);
        
    }
}
