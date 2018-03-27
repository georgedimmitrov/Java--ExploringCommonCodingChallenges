package algo.binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[] {1, 2, 3, 4, 7, 9, 12, 18}, 88));
    }

    public static int binarySearch(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (x < arr[middle]) {
                right = middle - 1;
            } else if (x > arr[middle]) {
                left = middle + 1;
            } else {
                return middle;
            }
        }

        return -1;
    }
}
