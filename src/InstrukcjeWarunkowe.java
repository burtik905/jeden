import java.util.Scanner;
public class InstrukcjeWarunkowe {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe: ");
        System.out.println("Podaj wiek: ");
        int ocena = scanner.nextInt();
        int wiek = scanner.nextInt();

        boolean dodatnia = ocena > 0;
        boolean ujemna = ocena < 0;
        boolean rownazero = ocena == 0;

        if (dodatnia) {
            System.out.println("Liczba jest dodatnia");
        } else if (ujemna) {
            System.out.println("Liczba jest ujemna");

        } else if (rownazero) {
            System.out.println("Liczba jest równa zero");

        }

        switch (ocena){
        case 1:
            System.out.println("Ocena jest niedostateczna");
            break;
        case 2:
            System.out.println("Ocena jest dopuszczająca");
            break;
        case 3:
            System.out.println("Ocena jest dostateczna");
            break;
        case 4:
            System.out.println("Ocena jest dobra");
            break;
        case 5:
            System.out.println("Ocena jest bardzo dobra");
            break;
        case 6:
            System.out.println("Ocena jest celująca");
            break;
    }
        if (wiek <= 12){
            System.out.println("Jesteś dzieckiem");
        } else if (wiek <= 17) {
            System.out.println("Jesteś nastolatkiem");
        } else if (wiek <= 64) {
            System.out.println("Jesteś Dorosły");
        }
    }
}
