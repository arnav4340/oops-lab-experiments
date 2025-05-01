public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();

        customer.addBalance(100);        
        customer.addBalance(250.75);     

        customer.showBalance();

        customer.deductBalance(50.50);
        customer.showBalance();
    }
}
