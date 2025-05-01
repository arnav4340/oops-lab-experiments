class Customer {
    private double balance;

    public void addBalance(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited (double): " + amount);
        }
    }

    public void addBalance(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited (int): " + amount);
        }
    }

    protected void deductBalance(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Deducted: " + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    void showBalance() {
        System.out.println("Current balance: " + balance);
    }
}

