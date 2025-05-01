import java.util.HashMap;
import java.util.Map;

public class ProductInventory {
    public static void main(String[] args) {
        
        HashMap<Integer, Integer> inventory = new HashMap<>();

        
        inventory.put(1001, 50);  
        inventory.put(1002, 25);  
        inventory.put(1003, 75);  

        System.out.println("Initial Inventory:");
        displayInventory(inventory);

        
        int productIdToUpdate = 1002;
        int newQuantity = inventory.get(productIdToUpdate) + 10;
        inventory.put(productIdToUpdate, newQuantity);
        System.out.println("\nUpdated quantity for product " + productIdToUpdate);

        
        int productIdToRemove = 1001;
        inventory.remove(productIdToRemove);
        System.out.println("Removed product " + productIdToRemove);

        System.out.println("\nFinal Inventory:");
        displayInventory(inventory);
    }

    
    private static void displayInventory(HashMap<Integer, Integer> inventory) {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty!");
            return;
        }

        System.out.println("Product ID\tQuantity");
        System.out.println("-----------------------");
        for (Map.Entry<Integer, Integer> entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + "\t\t" + entry.getValue());
        }
    }
}
