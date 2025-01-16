import java.util.Scanner;
public class OperatorsDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe: ");
        int number = scanner.nextInt();


        boolean positive = liczba > 0;
        boolean divisible= liczba % 2 == 0;

        int  f = 12;
        int a = ++f;
        int b = --f;

        System.out.println(a);
        System.out.println(b);



    if (divisible) {
        System.out.println("jest podzielna");
    } else  {
        System.out.println("nie jest podzielna");
        
    }

    if (positive) {
        System.out.println("jest dodatnia");
    } else {
        System.out.println("nie jest dodatnia");
    }


    }
}
