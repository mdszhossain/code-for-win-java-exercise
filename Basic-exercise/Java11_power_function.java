import java.util.Scanner;
import java.lang.Math;

public class Java11_power_function {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int base, exponent;
        double power;

        System.out.print("Enter base: ");
        base = sc.nextInt();
        System.out.print("Enter exponent: ");
        exponent = sc.nextInt();

        power = Math.pow(base, exponent);

        System.out.printf("Power is: %.0f" ,  power);

        sc.close();
    }
}
