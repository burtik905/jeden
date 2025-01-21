import java.util.Arrays;

public class Tablice {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double mean = (double) sum / numbers.length;
        System.out.println("arithmetic mean: " + mean);


        int[][] numberstwo = { {6, 7, 8, 9}, {10, 11, 12, 13} };

        for (int i = 0; i < numberstwo.length; i++) {
            for (int j = 0; j < numberstwo[i].length; j++){
                System.out.println(numberstwo[i][j]);
            }
        }

    }
}

