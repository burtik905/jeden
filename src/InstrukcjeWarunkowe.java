import java.util.Scanner;
public class InstrukcjeWarunkowe {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe: ");
        System.out.println("Podaj wiek: ");
        int grade = scanner.nextInt();
        int age = scanner.nextInt();

        boolean dodatnia = grade > 0;
        boolean ujemna = grade < 0;
        boolean rownazero = grade == 0;

        if (dodatnia) {
            System.out.println("Liczba jest dodatnia");
        } else if (ujemna) {
            System.out.println("Liczba jest ujemna");

        } else if (rownazero) {
            System.out.println("Liczba jest równa zero");

        }

        switch (grade){
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
        if (age <= 12){
            System.out.println("Jesteś dzieckiem");
        } else if (age <= 17) {
            System.out.println("Jesteś nastolatkiem");
        } else if (age <= 64) {
            System.out.println("Jesteś Dorosły");
        }
    }
}
