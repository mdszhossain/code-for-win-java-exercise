import java.util.Scanner;

public class Java7_cm_to_km_and_m {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int centimeter;
        double meter, kilometer;

        System.out.print("Enter length in cm: ");
        centimeter = sc.nextInt();

        meter = centimeter / 100.0;
        kilometer = centimeter / 100000.0;

        System.out.println("Centimeter to Meter: " + meter);
        System.out.println("Centimeter to Kilometer: " + kilometer);

        sc.close();
    }
}
