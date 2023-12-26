import java.util.Scanner;

public class Java4_perimeter_rectangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int length, breadth, perimeter;

        System.out.print("Enter length: ");
        length = sc.nextInt();
        System.out.print("Enter breadth: ");
        breadth = sc.nextInt();

        perimeter = 2 * (length + breadth);

        System.out.println("Perimeter of rectangle is: " + perimeter);

        sc.close();
    }
}
