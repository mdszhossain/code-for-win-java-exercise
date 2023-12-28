import java.util.Scanner;

public class Java8_vowel_consonant {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        char alphabet;

        System.out.print("Enter alphabet: ");
        alphabet = sc.next().charAt(0);

        if(alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u') {
            System.out.println("Vowel");
        } else if(alphabet == 'A' || alphabet == 'E' || alphabet == 'I' || alphabet == 'O' || alphabet == 'U') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }

        sc.close();
    }
}
