import java.util.Scanner;

public class projektjeden {
    public static void main(String[] args) {

        int a = 12;
        int b = 15;
        int c = a * b;
        int d = 10;
        d *= 5;
        System.out.println(c / a);
        System.out.println(c / a + b * a);
        System.out.println(c * a);
        System.out.println("a > b:" + (a > b));
        System.out.println("a < b:" + (a < b));
        System.out.println("c > b:" + (c > b));
        System.out.println(d);
        int ad = 19;
        if (ad >= 19) {
            System.out.println("tak");
        } else {
            System.out.println("nie");
        }

        System.out.println("wprowadź liczbe:");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println("Wprowadzona liczba to:" + input);
        switch (input) {
            case 1 -> System.out.println("jeden");
            case 2 -> System.out.println("dwa");
            case 3 -> System.out.println("trzy");
            case 4 -> System.out.println("cztery");
        }

    }
}
