import java.util.Scanner;

public class Java9_alphabet_digit_special_character {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        char character;

        System.out.print("Enter character: ");
        character = sc.next().charAt(0);

        if((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')) {
            System.out.println("Alphabet");
        } else if(character >= '0' && character <= '9') {
            System.out.println("Digit");
        } else {
            System.out.println("Special Character");
        }

        sc.close();
    }
}
