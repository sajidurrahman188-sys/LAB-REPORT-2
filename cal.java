import java.util.Scanner;

public class cal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = input.nextDouble();

        System.out.print("Enter second number: ");
        double b = input.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = input.next().charAt(0);

        double result;

        if (op == '+') {
            result = a + b;
            System.out.println("Result: " + result);
        } 
        else if (op == '-') {
            result = a - b;
            System.out.println("Result: " + result);
        } 
        else if (op == '*') {
            result = a * b;
            System.out.println("Result: " + result);
        } 
        else if (op == '/') {
            if (b != 0) {
                result = a / b;
                System.out.println("Result: " + result);
            } else {
                System.out.println("Cannot divide by zero");
            }
        } 
        else {
            System.out.println("Invalid operator");
        }

        input.close();
    }
}