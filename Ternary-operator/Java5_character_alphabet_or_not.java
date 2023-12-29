import java.util.Scanner;

public class Java5_character_alphabet_or_not {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        char character;
        String alphabet;

        System.out.print("Enter character: ");
        character = sc.next().charAt(0);

        alphabet = ((character >= 'a' && character <= 'z') || (character >= 'A' && character  <= 'Z')) ? "Alphabet" : "Not-Alphabet";

        System.out.println(alphabet);

        sc.close();
    }
}
