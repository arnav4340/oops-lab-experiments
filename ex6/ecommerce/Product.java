package ex6.ecommerce;

public class Product {
    public void getProductDetails() {
        System.out.println("Product details accessed.");
    }
    
    protected void applyDiscount() {
        System.out.println("Discount applied.");
    }
    
    void updateStock() {
        System.out.println("Stock updated.");
    }
    
    private void calculateProfit() {
        System.out.println("Profit calculated.");
    }
}