import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueNames {
    public static void main(String[] args) {
        
        String[] namesArray = {"AARAV", "ARNAV", "ANANT", "ARADHYA", "PAKHI"};
        
        
        Set<String> uniqueNames = new HashSet<>(Arrays.asList(namesArray));
        
        
        String nameToCheck = "ARNAV";
        
        
        if (uniqueNames.contains(nameToCheck)) {
            System.out.println(nameToCheck + " exists in the set.");
        } else {
            System.out.println(nameToCheck + " does not exist in the set.");
        }
        
        // Print all unique names
        System.out.println("\nUnique names:");
        for (String name : uniqueNames) {
            System.out.println(name);
        }
    }
}
