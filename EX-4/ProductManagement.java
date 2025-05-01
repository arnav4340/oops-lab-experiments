class Product {
    private static int totalProducts = 0;
    private int productId;
    private String productName;
    private String category;
    private double price;

    
    public Product() {
        this.productId = 0;
        this.productName = "Unknown";
        this.category = "Misc";
        this.price = 0.0;
        totalProducts++;
    }

    
    public Product(int productId, String productName, String category, double price) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.price = price;
        totalProducts++;
    }


    public double getPrice() {
        return price;
    }

    
    public void displayProductInfo() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Category: " + category);
        System.out.println("Price: $" + price);
    }

    
    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    
    public double calculateStockValue(int quantity) {
        return price * quantity;
    }

    
    public double calculateStockValue(int quantity, double discountRate) {
        double discountedPrice = price - (price * discountRate / 100);
        return discountedPrice * quantity;
    }
}

public class ProductManagement {
    public static void main(String[] args) {
        
        Product p1 = new Product(101, "Laptop", "Electronics", 750.50);
        Product p2 = new Product(102, "Phone", "Electronics", 500.00);
        Product p3 = new Product(); 

        
        Product.displayTotalProducts();

        
        System.out.println("\nProduct Details:");
        p1.displayProductInfo();
        System.out.println("Stock Value (10 units): $" + p1.calculateStockValue(10));
        System.out.println("Stock Value with 10% Discount (10 units): $" + p1.calculateStockValue(10, 10));

        System.out.println("\n----------------------------");
        p2.displayProductInfo();
        System.out.println("Stock Value (5 units): $" + p2.calculateStockValue(5));
        System.out.println("Stock Value with 15% Discount (5 units): $" + p2.calculateStockValue(5, 15));

        System.out.println("\n----------------------------");
        p3.displayProductInfo();
        System.out.println("Stock Value (3 units): $" + p3.calculateStockValue(3));
    }
}

