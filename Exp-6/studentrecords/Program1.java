package studentrecords;

import studentrecords.Invoice;
import studentrecords.TaxCalculator;

class TaxCalculator {
    final double GST_RATE = 18.0;
    
    final void displayGST() {
        System.out.println("GST Rate: " + GST_RATE + "%");
    }
}

class Invoice extends TaxCalculator {
    double calculateTotalWithTax(double amount) {
        return amount + (amount * GST_RATE / 100);
    }
}

public class Program1 {
    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        double amount = 1000.0;
        System.out.println("Total amount after applying GST: " + invoice.calculateTotalWithTax(amount));
    }
}