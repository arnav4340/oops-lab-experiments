class Car {
    private String make;
    private String model;
    private int year;

    
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayCarDetails() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
    }
}


public class CarDemo {
    public static void main(String[] args) {
        
        Car myCar = new Car("Tesla", "Model 3", 2025);
        
        
        myCar.displayCarDetails();
    }
}
