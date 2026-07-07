Java
// Team Collaboration Project: Area Calculator
// Author: Partner 2 (Added Rectangle Feature)
import java.util.Scanner;

public class AreaCalculator {

    public static double areaCircle(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    // --- ADDED BY PARTNER 2 ---
    public static double areaRectangle(double length, double width) {
        return length * width;
    }
    // --------------------------

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Collaborative Area Calculator ---");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle"); // Updated by Partner 2
        System.out.println("3. Triangle (Coming Soon)");
        
        System.out.print("\nChoose a shape (1-3): ");
        String choice = scanner.next();
        
        if (choice.equals("1")) {
            System.out.print("Enter radius: ");
            double r = scanner.nextDouble();
            System.out.printf("👉 Area of Circle: %.2f\n", areaCircle(r));
            
        } else if (choice.equals("2")) { // Added by Partner 2
            System.out.print("Enter length: ");
            double l = scanner.nextDouble();
            System.out.print("Enter width: ");
            double w = scanner.nextDouble();
            System.out.printf("👉 Area of Rectangle: %.2f\n", areaRectangle(l, w));
            
        } else {
            System.out.println("Feature not implemented yet or invalid choice.");
        }
        
        scanner.close();
    }
}
