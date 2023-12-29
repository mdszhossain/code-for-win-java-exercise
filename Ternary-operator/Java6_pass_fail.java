import java.util.Scanner;

public class Java6_pass_fail {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int marks;
        String status;

        System.out.print("Enter marks: ");
        marks = sc.nextInt();

        status = (marks >= 33) ? "PASS" : "FAIL";

        System.out.println(status);

        sc.close();
    }
}
