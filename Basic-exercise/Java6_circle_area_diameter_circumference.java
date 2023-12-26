import java.util.Scanner;

public class Java6_circle_area_diameter_circumference {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int radius;
        double diameter, area, circumference;

        System.out.print("Enter radius of circle: ");
        radius = sc.nextInt();

        diameter = 2.0 * radius;
        area = 3.14 * radius * radius;
        circumference = 2.0 * 3.14 * radius;

        System.out.println("Diameter: " + diameter);
        System.out.println("Circumference: " + circumference);
        System.out.println("Area: " + area);

        sc.close();
    }
}
