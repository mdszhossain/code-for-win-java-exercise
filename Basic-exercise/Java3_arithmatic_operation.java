import java.util.Scanner;
public class Java3_arithmatic_operation {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int number1, number2, summation, subtraction, multiplication, division, modulo;

        System.out.print("Enter first number: ");
        number1 = sc.nextInt();
        System.out.print("Enter second number: ");
        number2 = sc.nextInt();

        summation = number1 + number2;
        subtraction = number1 - number2;
        multiplication = number1 * number2;
        division = number1 / number2;
        modulo = number1 % number2;

        System.out.println("Summation: " + summation);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
        System.out.println("Modulo: " + modulo);

        sc.close();
    }
}