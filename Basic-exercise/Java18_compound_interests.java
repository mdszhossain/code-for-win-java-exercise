import java.util.Scanner;
import java.lang.Math;

public class Java18_compound_interests {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int principle_amount, time;
        double interest_rate, compound_interest;

        System.out.print("Enter principle amount: ");
        principle_amount = sc.nextInt();
        System.out.print("Enter time: ");
        time = sc.nextInt();
        System.out.print("Enter interest rate: ");
        interest_rate = sc.nextDouble();
        
        compound_interest = principle_amount * Math.pow((1 + (interest_rate / 100.0)), time);

        System.out.printf("Compound Interest: %.6f\n", compound_interest);

        sc.close();
    }
}
