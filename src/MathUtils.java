public class MathUtils {

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public int add(int a, int b) {
        return a + b;
    }
    boolean even(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        MathUtils mathUtils = new MathUtils();


        int result = mathUtils.add(5, 10, 15);

        System.out.println("Dodawanie liczb: " + result);

        boolean iseven = mathUtils.even(result);

        System.out.println("Czy liczba " +  result + " " + "jest parzysta?: " + iseven);

        }
    }

