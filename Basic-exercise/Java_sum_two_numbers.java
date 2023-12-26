import java.util.Scanner;
public class Java_sum_two_numbers {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int number1, number2, summation;

        System.out.print("Enter first number: ");
        number1 = sc.nextInt();
        System.out.print("Enter second number: ");
        number2 = sc.nextInt();

        summation = number1 + number2;

        System.out.println("Summation: " + summation);

        sc.close();
    }
}
