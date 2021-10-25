package search;

public class BinarySearch {

    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Search(array, 4));
    }

    public static int Search(int[] array, int target) {

        if (array.length == 0) {
            return -1;
        }

        int first = 0;
        int last = array.length-1;
        int middle = 0;

        while(first <= last) {
            middle = (first + last) / 2;

            if (array[middle] == target) {
                return middle;

            } else if (array[middle] > target) {
                last = middle - 1;

            } else if (array[middle] < target) {
                first = middle + 1;
            }
        }

        return -1;
    }
}
