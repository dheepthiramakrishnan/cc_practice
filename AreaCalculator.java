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

    // Partner 3 Feature
    public static double areaTriangle(double base, double height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Collaborative Area Calculator ---");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.print("\nChoose a shape (1-3): ");
        String choice = scanner.next();

        if (choice.equals("1")) {
            System.out.print("Enter radius: ");
            double r = scanner.nextDouble();
            System.out.printf("👉 Area of Circle: %.2f\n", areaCircle(r));
            
        } else if (choice.equals("2")) {
            System.out.print("Enter length: ");
            double l = scanner.nextDouble();
            System.out.print("Enter width: ");
            double w = scanner.nextDouble();
            System.out.printf("👉 Area of Rectangle: %.2f\n", areaRectangle(l, w));
            
        } else if (choice.equals("3")) {
            System.out.print("Enter base: ");
            double b = scanner.nextDouble();
            System.out.print("Enter height: ");
            double h = scanner.nextDouble();
            System.out.printf("👉 Area of Triangle: %.2f\n", areaTriangle(b, h));
        } else {
            System.out.println("Feature not implemented yet or invalid choice.");
        }

        scanner.close();
    }
}
