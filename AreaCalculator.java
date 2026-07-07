// Team Collaboration Project: Area Calculator
// Author: Partner 1 (Base Setup & Circle Feature)
import java.util.Scanner;

public class AreaCalculator {

    // Partner 1 Feature
    public static double areaCircle(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Collaborative Area Calculator ---");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle (Coming Soon)");
        System.out.println("3. Triangle (Coming Soon)");
        
        System.out.print("\nChoose a shape (1-3): ");
        String choice = scanner.next();
        
        if (choice.equals("1")) {
            System.out.print("Enter radius: ");
            double r = scanner.nextDouble();
            System.out.printf("👉 Area of Circle: %.2f\n", areaCircle(r));
        } else {
            System.out.println("Feature not implemented yet or invalid choice.");
        }
        
        scanner.close();
    }
}