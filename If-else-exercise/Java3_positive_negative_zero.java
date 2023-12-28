import java.util.Scanner;

public class Java3_positive_negative_zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;

        System.out.print("Enter a number: ");
        number = sc.nextInt();

        if(number > 0) {
            System.out.println("Number is Positive");
        } else if(number < 0) {
            System.out.println("Number is Negative");
        } else {
            System.out.println("Number is zero");
        }

        sc.close();
    }
}
