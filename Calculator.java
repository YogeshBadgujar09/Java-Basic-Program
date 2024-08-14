import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Simple Calculator");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Choose an operation: ");
        int choice = scanner.nextInt();
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        scanner.close();      
        
        switch (choice) {
            case 1:
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case 2:
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case 3:
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0)
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                else
                    System.out.println("Error! Division by zero is not allowed.");
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
