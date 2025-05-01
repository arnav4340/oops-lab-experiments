import java.util.*;

public class electricbill{
    public static void main(String[] args) {
        int u, b = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the unit consumed: ");
        u = sc.nextInt();
        
    
        if (u >= 0 && u <= 100) {
            b = u * 5;  
        } 
        else if (u >= 101 && u <= 200) {
            b = 100 * 5 + (u - 100) * 7;  
        } 
        else if (u >= 201 && u <= 300) {
            b = 100 * 5 + 100 * 7 + (u - 200) * 10;  
        } 
        else if (u > 300) {
            b = 100 * 5 + 100 * 7 + 100 * 10 + (u - 300) * 15; 
        }

        System.out.println("Your bill is: " + b);
        sc.close();
    }
}
