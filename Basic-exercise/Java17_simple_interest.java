import java.util.Scanner;

public class Java17_simple_interest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int principle, time;
        double interest_rate, simple_interest;

        System.out.print("Enter principle amount: ");
        principle = sc.nextInt();
        System.out.print("Enter time: ");
        time = sc.nextInt();
        System.out.print("Enter interest rate: ");
        interest_rate = sc.nextDouble();
        
        simple_interest = (principle * time * interest_rate) / 100;

        System.out.printf("Simple Interest: %.2f\n", simple_interest);

        sc.close();
    }
}
