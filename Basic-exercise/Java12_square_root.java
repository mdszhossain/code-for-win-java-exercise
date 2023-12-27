import java.util.Scanner;
import java.lang.Math;

public class Java12_square_root {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int number;
        double square_root;

        System.out.print("Enter the number: ");
        number = sc.nextInt();

        square_root = Math.sqrt(number);

        System.out.printf("Square root = %.0f", square_root);

        sc.close();
    }
}
