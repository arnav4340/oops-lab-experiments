package Exp6;  // Changed from Exp-6 to Exp6 (no hyphens allowed in package names)

// Final class that cannot be inherited
final class SecuritySystem {
    // Method to authenticate user credentials
    public boolean authenticateUser(String username, String password) {
        // Simple authentication logic (for demonstration purposes)
        return "admin".equals(username) && "password123".equals(password);
    }
}

// This class is commented out since it attempts to extend a final class
// Attempting to create a subclass will cause a compilation error
/*
class AdvancedSecurity extends SecuritySystem {
    // This will cause a compilation error
    @Override
    public boolean authenticateUser(String username, String password) {
        // Attempting to override the method
        return false; // Just a placeholder
    }
}
*/

public class Main {
    public static void main(String[] args) {
        // Create an instance of SecuritySystem
        SecuritySystem securitySystem = new SecuritySystem();

        // Validate login credentials
        String username = "admin";
        String password = "password123";

        if (securitySystem.authenticateUser(username, password)) {
            System.out.println("Authentication successful!");
        } else {
            System.out.println("Authentication failed!");
        }

        // This is commented out as it would cause a compilation error
        // AdvancedSecurity advancedSecurity = new AdvancedSecurity();
        // advancedSecurity.authenticateUser(username, password);
    }
}

