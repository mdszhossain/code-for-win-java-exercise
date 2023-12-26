import java.util.Scanner;
public class Java1_input_output {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int integer_value;
        char character_value;
        float floating_value;
        double big_floating_value;

        System.out.print("Enter integer value: ");
        integer_value = sc.nextInt();
        System.out.print("Enter character value: ");
        character_value = sc.next().charAt(0);
        System.out.print("Enter floating value: ");
        floating_value = sc.nextFloat();
        System.out.print("Enter double value: ");
        big_floating_value = sc.nextDouble();

        System.out.println("Integer Value: " + integer_value);
        System.out.println("Character Value: " + character_value);
        System.out.println("Floating Value: " + floating_value);
        System.out.println("Double Value: " + big_floating_value);
        
        sc.close();
    }
}
