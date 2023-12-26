import java.util.Scanner;

public class Java9_fahrenheit_to_celsius {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int fahrenheit;
        double celsius;

        System.out.print("Enter temperature in fahrenheit: ");
        fahrenheit = sc.nextInt();

        celsius = (fahrenheit - 32) * (5.0 / 9.0);

        System.out.println("Temperature in Celsius: " + celsius);

        sc.close();
    }
}
