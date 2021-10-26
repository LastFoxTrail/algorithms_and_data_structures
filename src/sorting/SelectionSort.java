package sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = new int[] {1, 5, 2, 3, 8, 10, 6, 7, 4, 9, 2, -10, 15};
        Sort(arr);

        Arrays.stream(arr).forEach(System.out::println);
    }

    public static void Sort(int[] array) {
        if (array.length <= 1) {
            return;
        }

        int min;
        int minIndex;

        for (int i = 0; i < array.length; i++)
        {
            min = array[i];
            minIndex = i;

            for (int j = i + 1; j < array.length; j++) {

                if (array[j] < min) {
                    min = array[j];
                    minIndex = j;
                }
            }

            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
}
