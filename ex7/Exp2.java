interface Vehicle{
    void Start();
    void Stop();
    void getFuelLevel();
};

class Car implements Vehicle {

    @Override
    public void Start() {
        System.out.println("Starting the engine of Car...");
    }

    @Override
    public void Stop() {
        System.out.println("Stopping the Engine of Car...");
    }

    @Override
    public void getFuelLevel() {
        System.out.println("Your Car has 50L fuel capacity");
    }
    
};

class Motorcycle implements Vehicle{

    @Override
    public void Start() {
        System.out.println("Starting the engine of Motorcycle...");
    }

    @Override
    public void Stop() {
        System.out.println("Stopping the Engine of Motorcycle...");
    }

    @Override
    public void getFuelLevel() {
        System.out.println("Your Motorcycle has 20L fuel capacity");
    }
    
};

public class Exp2{
    public static void main(String[] args) {
        
        Vehicle objCar = new Car();
        Vehicle objMotorcycle = new Motorcycle();

        System.out.println("Car:- ");
        objCar.Start();
        objCar.getFuelLevel();
        objCar.Stop();

        System.out.println("\n");

        System.out.println("Motorcycle:- ");
        objMotorcycle.Start();
        objMotorcycle.getFuelLevel();
        objMotorcycle.Stop();

    }
}