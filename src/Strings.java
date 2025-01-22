import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj słowo: ");
        String wordone = scanner.nextLine();

        System.out.println("Podaj drugie słowo: ");
        String wordtwo = scanner.nextLine();
        String together = wordone + wordtwo;

        System.out.println(together);

        String literal = "jeden";
        String newstring = new String("jeden");

        if (literal == newstring) {
            System.out.println("słowa są takie same");
        } else {
            System.out.println("słowa nie są takie same");
        }

    }
}
