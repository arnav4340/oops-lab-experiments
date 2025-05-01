import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine(); 
        scanner.close(); 

        
        String[] words = input.split(" "); 
        String result = "";

        for (int i = words.length - 1; i >= 0; i--) {
            result += words[i] + " "; 
        }

        
        System.out.println("Reversed: " + result);
    }
}
 