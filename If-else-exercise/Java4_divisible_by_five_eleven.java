import java.util.Scanner;

public class Java4_divisible_by_five_eleven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;

        System.out.print("Enter number: ");
        number = sc.nextInt();

        if((number % 5 == 0) && (number % 11 == 0)) {
            System.out.println("Number is divisible by both 5 and 11");
        } else if(number % 5 == 0) {
            System.out.println("Number is divisible by only 5");
        } else if(number % 11 == 0) {
            System.out.println("Number is divisible by only 11");
        } else {
            System.out.println("Number is not divisibly by any of 5 or 11");
        }

        sc.close();
    }
}
