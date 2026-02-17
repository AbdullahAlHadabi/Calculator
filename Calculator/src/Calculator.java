import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number:");
        int num2 = scanner.nextInt();

        // Addition and Subtraction
        int sum = num1 + num2;
        int difference = num1 - num2;
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);


        // Multiplication and Division
        int product = num1 * num2;
        int quotient = num1 / num2;
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

        int factorial = 1;
        for ( int i = num1; i >=1 ;i-- ){
            factorial = factorial * i ;

        }
        System.out.println("factorial: " + factorial);




        scanner.close();
    }
}
