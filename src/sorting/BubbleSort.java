package sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 10, 99, -10, 2, 56, 34, 8};
        Arrays.stream(Sort(array)).forEach(item -> System.out.print(item + " "));
    }

    public static int[] Sort(int[] array) {
        int temp = array[0];
        boolean flag = false;

        while(!flag) {
            flag = true;

            for(int i = 1; i < array.length; i++) {

                if (array[i] < array[i - 1]) {
                    temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    flag = false;
                }
            }
        }

        return array;
    }
}
