import java.util.Scanner;

public class Java12_days_month_number {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int month_number;

        System.out.print("Enter month number: ");
        month_number = sc.nextInt();

        if(month_number == 1) {
            System.out.println("January - 31 days");
        } else if(month_number == 2) {
            System.out.println("February - 28/29 days");
        } else if(month_number == 3) {
            System.out.println("March - 31 days");
        } else if(month_number == 4) {
            System.out.println("April - 30 days");
        } else if(month_number == 5) {
            System.out.println("May - 31 days");
        } else if(month_number == 6) {
            System.out.println("June - 30 days");
        } else if(month_number == 7) {
            System.out.println("July - 31 days");
        } else if(month_number == 8) {
            System.out.println("Agust - 31 days");
        } else if(month_number == 9) {
            System.out.println("September - 30 days");
        } else if(month_number == 10) {
            System.out.println("October - 31 days");
        } else if(month_number == 11) {
            System.out.println("November - 30 days");
        } else if(month_number == 12) {
            System.out.println("December - 31 days");
        } else {
            System.out.println("Invalid Month Number");
        } 

        sc.close();
    }
}
