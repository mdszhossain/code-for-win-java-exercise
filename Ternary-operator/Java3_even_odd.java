import java.util.Scanner;

public class Java3_even_odd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int number;
        String check;

        System.out.print("Enter number: ");
        number = sc.nextInt();

        check = (number % 2 == 0) ? "even" : "odd";

        System.out.println("Number is: " + check);

        sc.close();
    }
}
