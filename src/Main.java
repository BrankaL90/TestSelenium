
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        array();
    }

    public static void array() {

        int[][] niz2d = new int[][]{
               {1, 2, 8},
                {3, 4, 10},
                {5, 6, 15, 16}

        };
        for (int i = 0; i < niz2d.length; i++) {
            for (int j = 0; j < niz2d[i].length; j++) {
                System.out.println(niz2d[i][j]);
            }}

        int[] numbers = {10, 5, 20, 8, 15, 16};


        int largestNumber = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largestNumber) {
                largestNumber = numbers[i];
            }
        }
        Arrays.sort(numbers);

        System.out.println("The largest number in the array is: " + largestNumber);

        System.out.println("Array sorted in ascending order: " + Arrays.toString(numbers));

    }}

