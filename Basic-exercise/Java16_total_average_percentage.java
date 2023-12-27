import java.util.Scanner;

public class Java16_total_average_percentage {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int physics, chemistry, biology, math, english, total;
        double average, percentage;

        System.out.print("Enter marks of physics: ");
        physics = sc.nextInt();
        System.out.print("Enter marks of chemistry: ");
        chemistry = sc.nextInt();
        System.out.print("Enter marks of biology: ");
        biology = sc.nextInt();
        System.out.print("Enter marks of math: ");
        math = sc.nextInt();
        System.out.print("Enter marks of english: ");
        english = sc.nextInt();

        total = physics + chemistry + biology + math + english;
        average = total / 5.0;
        percentage = (total / 500.0) * 100;

        System.out.println("Total: " + total);
        System.out.printf("Average: %.2f\n", average);
        System.out.printf("Percentage: %.2f\n", percentage);

        sc.close();
    }
}
