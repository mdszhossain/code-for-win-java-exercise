import java.util.Scanner;

public class Java2_max_between_three {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int number1, number2, number3, max;

        System.out.print("Enter number1: ");
        number1 = sc.nextInt();
        System.out.print("Enter number2: ");
        number2 = sc.nextInt();
        System.out.print("Enter number3: ");
        number3 = sc.nextInt();

        max = (number1 > number2 && number1 > number3) ? number1 : (number2 > number1 && number2 > number3) ? max = number2 : number3;

        System.out.println("Maximum between three is: " + max);

        sc.close();
    }
}
