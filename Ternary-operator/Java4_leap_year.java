import java.util.Scanner;

public class Java4_leap_year {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int year;
        String leap_year;

        System.out.print("Enter number: ");
        year = sc.nextInt();

        leap_year = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0) ? "Leap-Year" : "Not-Leap-Year";

        System.out.println(leap_year);

        sc.close();
    }
}
