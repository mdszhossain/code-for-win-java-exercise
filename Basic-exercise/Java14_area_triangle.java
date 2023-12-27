import java.util.Scanner;

public class Java14_area_triangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int height, base;
        double area;

        System.out.print("Enter height: ");
        height = sc.nextInt();
        System.out.print("Enter base: ");
        base = sc.nextInt();

        area = (height * base) / 2.0;

        System.out.printf("Area of triangle is: %.2f ", area);

        sc.close();
    }
}
