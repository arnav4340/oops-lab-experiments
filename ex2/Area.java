import java.util.*;

public class Area {
    public static void main(String[] args) {
        int ch;
        double area = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Choose according to numbers:");
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Circle");
        System.out.println("4. Triangle");
        
        ch = sc.nextInt();
      
        if (ch == 1) {
            System.out.print("Enter the side of the square: ");
            double side = sc.nextDouble();
            area = side * side;
        } 
        else if (ch == 2) {
            System.out.print("Enter the length of the rectangle: ");
            double length = sc.nextDouble();
            System.out.print("Enter the width of the rectangle: ");
            double width = sc.nextDouble();
            area = length * width;
        } 
        else if (ch == 3) {
            System.out.print("Enter the radius of the circle: ");
            double radius = sc.nextDouble();
            area = Math.PI * radius * radius;  
        } 
        else if (ch == 4) {
            System.out.print("Enter the base of the triangle: ");
            double base = sc.nextDouble();
            System.out.print("Enter the height of the triangle: ");
            double height = sc.nextDouble();
            area = 0.5 * base * height;
        } 
        else {
            System.out.println("Wrong input");
            sc.close();
            return; 
        }

        System.out.println("Area is: " + area);
        sc.close();
    }
}