import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj słowo: ");
        String wordone = scanner.nextLine();

        System.out.println("Podaj drugie słowo: ");
        String wordtwo = scanner.nextLine();
        String together = wordone + " " + wordtwo;

        System.out.println(together);

        System.out.println("Podaj pierwsze słowo do porównania: ");
        String literal = scanner.nextLine();

        System.out.println("Podaj drugie słowo do porównania: ");
        String newstring = new String(scanner.nextLine());

        if (literal.equals(newstring)) {
            System.out.println("Słowa są takie same");
        } else {
            System.out.println("Słowa nie są takie same");
        }

        scanner.close();
    }
}
