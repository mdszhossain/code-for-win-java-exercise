import java.util.Scanner;
public class Java1_max_between_two {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int number1, number2;

        System.out.print("Enter number1: ");
        number1 = sc.nextInt();
        System.out.print("Enter number2: ");
        number2 = sc.nextInt();

        if(number1 > number2) {
            System.out.println("Number1 is large");
        } else {
            System.out.println("Number2 is large");
        }

        sc.close();
    }
}
