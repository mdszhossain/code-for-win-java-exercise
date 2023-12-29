import java.util.Scanner;

public class Java11_week_day_by_number {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int week_number;

        System.out.print("Enter week number: ");
        week_number = sc.nextInt();

        if(week_number == 1) {
            System.out.println("Monday");
        } else if(week_number == 2) {
            System.out.println("Tuesday");
        } else if(week_number == 3) {
            System.out.println("Wednesday");
        } else if(week_number == 4) {
            System.out.println("Thursday");
        } else if(week_number == 5) {
            System.out.println("Friday");
        } else if(week_number == 6) {
            System.out.println("Saturday");
        } else if(week_number == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid Week Number");
        }

        sc.close();
    }
}
