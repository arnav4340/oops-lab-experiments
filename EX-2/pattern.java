public class pattern {
    
    public static void main(String[] args) {
        
        int sp = 0, k;
        
        for (int i = 5; i >= 1; i--) {
            
            for (k = 0; k < sp; k++) {
                System.out.print(" ");
            }

            
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }

            
            System.out.println();
            sp++; 
        }
    }
}
