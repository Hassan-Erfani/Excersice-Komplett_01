package arrays;

import java.util.Arrays;

public class NumberHelper {

    public static void main(String[] args) {
        int[] arr = {1,3,3,5,6,6};
        System.out.println(isSortedArray(arr));
        System.out.println(Arrays.toString(removeDuplicates(arr)));
    }

    public static boolean isSortedArray(int[] numbers) {
        for (int i = 0; i < numbers.length-1; i++) {
            if (numbers[i] > numbers[i + 1])
                return false;
        }
        return true;
    }

    public static int[] removeDuplicates(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    numbers[i] = -1;
                }
            }
        }
        return numbers;
    }
}


