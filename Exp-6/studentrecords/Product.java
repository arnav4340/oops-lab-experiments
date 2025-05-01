package ECommerce;

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

package studentrecords;

import ECommerce.Product;

public class CustomerCart {
    public static void main(String[] args) {
        Product product = new Product();
        product.getProductDetails();

}
}
