package Old;

public class evensum {
    public static void main(String[] args) {
        int num = 23764;
        int sum = 0;
        int EvenSum = 0;
        int OddSum = 0;
        while (num > 0) {
            int rem = num % 10;
            sum = sum + rem;
            if (rem % 2 == 0)
                EvenSum = EvenSum + rem;
            else
                OddSum = OddSum + rem;
            num = num / 10;
        }
        System.out.println(sum);

        System.out.println("Sum of even: " + EvenSum);
        System.out.println("Sum of Odd: " + OddSum);
    }
}
