import java.util.Scanner;

abstract class Solid{
    abstract float calculateVolume();
};

class Cuboid extends Solid{
    float l,b,h;
    Scanner inp =new Scanner(System.in);
    float calculateVolume(){
        System.out.print("Enter Length, Breadth and Height of Cuboid: ");
        l=inp.nextFloat();
        b=inp.nextFloat();
        h=inp.nextFloat();
        inp.nextLine();

        return l*b*h;
    }
};

class Sphere extends Solid{
    float r;
    double ans;
    Scanner inp =new Scanner(System.in);
    float calculateVolume(){
        System.out.print("Enter Radius of Sphere: ");
        r=inp.nextFloat();
        inp.nextLine();

        ans=(4.0/3.0)*3.14*Math.pow(r, 3);
        return (float) ans;
    }
};

public class Exp1{
    public static void main(String[] args) {
        System.out.println("Cuboid:-");
        Cuboid cubObj = new Cuboid();
        System.out.println("Volume is: "+cubObj.calculateVolume());

        System.out.println("Sphere:-");
        Sphere spObj = new Sphere();
        System.out.println("Volume is: "+spObj.calculateVolume());
    }
}