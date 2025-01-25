import java.util.Scanner;

class Calculator {

    // Method to add two numbers
    public double add(double a, double b) {
        return a + b;
    }

    // Method to subtract two numbers
    public double subtract(double a, double b) {
        return a - b;
    }

    // Method to multiply two numbers
    public double multiply(double a, double b) {
        return a * b;
    }

    // Method to divide two numbers
    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN;
        }
        return a / b;
    }

    // Method to check if a number is odd
    public boolean isOdd(int number) {
        return number % 2 != 0;
    }

    // Method to check if a number is even
    public boolean isEven(int number) {
        return number % 2 == 0;
    }
}

public class CalculatorClass {
    public static void main(String[] args) {
        // Create Scanner and Calculator objects
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Welcome to the Calculator Application!");

        // Declare variables for user input
        double num1, num2;
        int number;

        while (true) {
            // Display menu options
            System.out.println("\nPlease select a command:");
            System.out.println("1. Add Two Numbers");
            System.out.println("2. Subtract Two Numbers");
            System.out.println("3. Multiply Two Numbers");
            System.out.println("4. Divide Two Numbers");
            System.out.println("5. Check if a Number is Odd");
            System.out.println("6. Check if a Number is Even");
            System.out.println("7. Exit the Application");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + calculator.add(num1, num2));
                    break;
                case 2:
                    System.out.print("Enter the first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + calculator.subtract(num1, num2));
                    break;
                case 3:
                    System.out.print("Enter the first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + calculator.multiply(num1, num2));
                    break;
                case 4:
                    System.out.print("Enter the first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + calculator.divide(num1, num2));
                    break;
                case 5:
                    System.out.print("Enter a number: ");
                    number = scanner.nextInt();
                    System.out.println("The number is " + (calculator.isOdd(number) ? "Odd." : "Not Odd."));
                    break;
                case 6:
                    System.out.print("Enter a number: ");
                    number = scanner.nextInt();
                    System.out.println("The number is " + (calculator.isEven(number) ? "Even." : "Not Even."));
                    break;
                case 7:
                    System.out.println("Exiting the application. Goodbye!");
                    scanner.close();
                    return; // Exit the application
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
