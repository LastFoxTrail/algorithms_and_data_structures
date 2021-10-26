package sorting;

import java.util.Arrays;

public class SortByInserts {

    public static void main(String[] args) {
        int[] array = new int[] {-1, 2, 4, 5, 10};

        Sort(array);
        Arrays.stream(array).forEach(System.out::println);
    }

    public static void Sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i;

            while (j > 0 && array[j - 1] > current) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = current;
        }
    }

    //Native implementation
/*    public static void Sort(int[] array) {
        int currentIndex;

        for (int i = 0; i < array.length-1; i++) {
            currentIndex = i + 1;
            int j = i;

            while (currentIndex > 0 && j >= 0) {

                if (array[currentIndex] < array[j]) {
                    int temp = array[j];
                    array[j] = array[currentIndex];
                    array[currentIndex] = temp;
                }

                currentIndex--;
                j--;
            }
        }
    }*/
}
