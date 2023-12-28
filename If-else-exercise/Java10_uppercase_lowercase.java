import java.util.Scanner;

public class Java10_uppercase_lowercase {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        char alphabet;

        System.out.print("Enter character: ");
        alphabet = sc.next().charAt(0);

        if(alphabet >= 'a' && alphabet <= 'z') {
            System.out.println("Lowercase");
        } else {
            System.out.println("Uppercase");
        }

        sc.close();
    }
}
