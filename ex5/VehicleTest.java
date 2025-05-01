
abstract class Vehicle {
    protected String make;
    protected String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    
    public abstract void startEngine();
    public abstract void stopEngine();

    
    public void serviceInfo() {
        System.out.println("Servicing Instructions:");
        System.out.println("1. Change engine oil every 5,000 km.");
        System.out.println("2. Check tire pressure weekly.");
        System.out.println("3. Inspect brakes every 10,000 km.");
    }
}


class Car extends Vehicle {
    
    public Car(String make, String model) {
        super(make, model);
    }

    
    @Override
    public void startEngine() {
        System.out.println(make + " " + model + " engine started. Vroom Vroom!");
    }

    
    @Override
    public void stopEngine() {
        System.out.println(make + " " + model + " engine stopped. Goodbye!");
    }
}


public class VehicleTest {
    public static void main(String[] args) {
        
        Car myCar = new Car("Toyota", "Corolla");

        
        myCar.startEngine();  
        myCar.serviceInfo();  
        myCar.stopEngine();   
}
}
