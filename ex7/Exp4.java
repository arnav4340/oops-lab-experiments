
import java.util.Scanner;

interface Remote{
    public void powerOn(); 
    public void powerOff();
    public void changeChannel(int channel);
}

class Television implements Remote{
    
    private int state=0;

    @Override
    public void powerOn(){
        state=1;
        System.out.println("TV is now on...");
    }

    @Override
    public void powerOff(){
        state=0;
        System.out.println("TV is now Off....");
    }

    @Override
    public void changeChannel(int channel) {
        if (state==1) {
            System.out.println("Channel changed to "+channel);    
        }
        else {
            System.err.println("Please turn On TV to change Channel");
        }
        
    }
}

public class Exp4{
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        int choice,ch,i=0;
        Remote obj = new Television();
        while(i==0){
            
            System.out.println(" 1. Turn On TV \n 2. Turn Off TV \n 3. Change Channel");
            System.out.print("Enter your choice: ");
            choice=inp.nextInt();
            inp.nextLine();

            switch(choice) {
                case 1:
                    obj.powerOn();
                    break;
                case 2: 
                    i+=1;
                    obj.powerOff();
                    break;
                case 3:
                    System.out.print("Enter Channel Number: ");
                    ch=inp.nextInt();
                    inp.nextLine();
                    obj.changeChannel(ch);
                    break;
                default:
                    System.out.println("Please enter the Valid Choice...");
            }
        }
    }
}