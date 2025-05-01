import java.util.ArrayList;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(15);
        numbers.add(23);
        numbers.add(29);
        numbers.add(30);
        numbers.add(37);
        numbers.add(42);
        numbers.add(47);

        
        for (Integer num : numbers) {
            int n = num; 
            boolean isPrime = isPrimeNumber(n);
            System.out.println(n + " is " + (isPrime ? "" : "not ") + "a prime number");
        }
    }

    
    private static boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}