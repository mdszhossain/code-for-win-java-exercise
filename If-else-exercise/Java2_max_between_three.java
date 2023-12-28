import java.util.Scanner;

public class Java2_max_between_three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number1, number2, number3;

        System.out.print("Enter number1: ");
        number1 = sc.nextInt();
        System.out.print("Enter number2: ");
        number2 = sc.nextInt();
        System.out.print("Enter number3: ");
        number3 = sc.nextInt();

        if(number1 > number2 && number1 > number3) {
            System.out.println("Number1 is largest among 3");
        } else if(number2 > number1 && number2 > number3) {
            System.out.println("Number2 is largest amontg 3");
        } else {
            System.out.println("Number3 is largest among 3");
        }

        sc.close();
    }
}
