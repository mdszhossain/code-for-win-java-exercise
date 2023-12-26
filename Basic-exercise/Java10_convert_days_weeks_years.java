import java.util.Scanner;

public class Java10_convert_days_weeks_years {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int days, weeks, years;

        System.out.print("Enter days: ");
        days = sc.nextInt();

        years = days / 365;
        weeks = (days % 365) / 7;
        days = days - ((years * 365) + (weeks * 7));

        System.out.println("Years = " + years);
        System.out.println("Weeks = " + weeks);
        System.out.println("Days = " + days);

        sc.close();
    }
}
