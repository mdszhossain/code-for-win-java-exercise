import java.util.Scanner;

public class Java5_even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;

        System.out.print("Enter number: ");
        number = sc.nextInt();

        if(number % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

        sc.close();
    }
}
