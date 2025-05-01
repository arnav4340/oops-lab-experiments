import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SumOfUniqueValues {
    public static void main(String[] args) {
        
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(3);
        numbers.add(8);
        numbers.add(2);
        numbers.add(5);

        System.out.println("Original list: " + numbers);

        
        Set<Integer> uniqueNumbers = new HashSet<>(numbers);

        System.out.println("Unique values: " + uniqueNumbers);

        
        int sum = uniqueNumbers.stream().mapToInt(Integer::intValue).sum();

        System.out.println("Sum of unique values: " + sum);
    }
}
