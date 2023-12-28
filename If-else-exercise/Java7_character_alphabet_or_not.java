import java.util.Scanner;

public class Java7_character_alphabet_or_not {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        char character;

        System.out.print("Enter character: ");
        character = sc.next().charAt(0);

        if((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')) {
            System.out.println("Alphabet");
        } else {
            System.out.println("Not Alphabet");
        }

        sc.close();
    }
}
