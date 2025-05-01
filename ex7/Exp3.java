
import java.util.Scanner;

interface Wallet{
    void addFunds(double amount);
    void spendFunds(double amount);
};

class DigitalWallet implements Wallet{
    
    double amt=0;

    @Override
    public void addFunds(double amount){
        amt+=amount;
        System.out.println("Funds Added Successsfully !!!!");
    }

    @Override
    public void spendFunds(double amount){
        if (amt==0) {
            System.out.println("Insufficient Balance ..");
            
        } else {
            amt-=amount;
            System.out.println("Funds Deducted Successsfully !!!!");
        }
        
    }

    public double getBal(){
        return amt;
    }
    
}

public class Exp3{
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        double amt=0;
        int ch,i=0;
        DigitalWallet obj = new DigitalWallet();
        while(i==0){
            
            System.out.println(" 1. Add Funds \n 2. Spend Funds \n 3. Get Balance \n 4. Exit");
            System.out.print("Enter your choice: ");
            ch=inp.nextInt();

            switch(ch) {
                case 1:
                    System.out.print("Enter Amount to be deposited: ");
                    amt=inp.nextDouble();
                    obj.addFunds(amt);
                    break;
                case 2: 
                    System.out.print("Enter Amount to withdraw: ");
                    amt=inp.nextDouble();
                    obj.spendFunds(amt);
                    break;
                case 3:
                    System.out.println("Your Balance is: "+obj.getBal());
                    break;
                case 4:
                    i+=1;
                    System.out.println("Thank U, Visit Again !!! ");
                    break;
                default:
                    System.out.println("Please enter the Valid Choice...");
            }
            
        }
    }
}