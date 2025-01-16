import java.util.Scanner;
public class Pętłe {
    public static void main(String[] args) {
        System.out.println("Pętla jeden");

        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
        int i = 0;

        System.out.println("Pętla dwa");

        while (i < 20) {
            System.out.println(i);
            i+=2;
        }
        System.out.println("Pętla trzy");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int number = scanner.nextInt();

        do {
            System.out.println(number);
            number--;
        } while (number > 0);
    }
}
