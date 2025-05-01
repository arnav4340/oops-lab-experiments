package ex6;  

final class SecuritySystem {
    
    public boolean authenticateUser(String username, String password) {
        
        return "admin".equals(username) && "password123".equals(password);
    }
}


class AdvancedSecurity extends SecuritySystem {
    
    @Override
    public boolean authenticateUser(String username, String password) {
        
        return false; 
    }
}
*/

public class SecurityCode {
    public static void main(String[] args) {
        
        SecuritySystem securitySystem = new SecuritySystem();

        
        String username = "admin";
        String password = "password123";

        if (securitySystem.authenticateUser(username, password)) {
            System.out.println("Authentication successful!");
        } else {
            System.out.println("Authentication failed!");
        }

    }
}

