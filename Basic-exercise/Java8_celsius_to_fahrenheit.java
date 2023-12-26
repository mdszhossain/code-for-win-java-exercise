import java.util.Scanner;

public class Java8_celsius_to_fahrenheit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int celsius;
        double fahrenheit;

        System.out.print("Enter temperature in celsius: ");
        celsius = sc.nextInt();

        fahrenheit = (celsius * (9.0 / 5.0)) + 32;

        System.out.println("Temperature in fahrenheit: " + fahrenheit);

        sc.close();
    }
}
