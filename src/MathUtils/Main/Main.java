public class Main {
    public static void main(String[] args) {
        MathUtils mathUtils = new MathUtils();

        int result = mathUtils.add(5, 10, 15);
        System.out.println("Dodawanie liczb: " + result);

        boolean isEven = mathUtils.even(result);
        System.out.println("Czy liczba " + result + " jest parzysta?: " + isEven);
    }
}
