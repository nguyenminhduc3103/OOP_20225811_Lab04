import java.util.Scanner;

public class Ex2_2_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        String a = scanner.next();  
        System.out.print("Enter the second number: ");
        String b = scanner.next();  

        try {
            double firstNumber = Double.parseDouble(a);
            double secondNumber = Double.parseDouble(b);

            System.out.println("Sum: " + (firstNumber + secondNumber));
            System.out.println("Difference: " + (firstNumber - secondNumber));
            System.out.println("Product: " + (firstNumber * secondNumber));

            if (secondNumber != 0) {
                System.out.println("Quotient: " + (firstNumber / secondNumber));
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid numbers.");
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
