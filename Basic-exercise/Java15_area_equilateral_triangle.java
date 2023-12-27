import java.util.Scanner;
import java.lang.Math;

public class Java15_area_equilateral_triangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int side;
        double area;

        System.out.print("Enter side of triangle: ");
        side = sc.nextInt();

        area = ((Math.sqrt(3)) / 4.0) * (Math.pow(side, 2));

        System.out.printf("Area of equilateral triangle is: %.1f ", area);

        sc.close();
    }
}
