import java.util.Scanner;

public class Java1_max_between_two {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int number1, number2, max;

        System.out.print("Enter number1: ");
        number1 = sc.nextInt();

        System.out.print("Enter number2: ");
        number2 = sc.nextInt();

        max = (number1 > number2) ? number1 : number2;

        System.out.println("Maximum between two number is: " + max);

        sc.close();
    }
}
