package my_algorithm;

import java.util.NoSuchElementException;

public class BinarySearch {
    public static int bs (int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int mid = (left + right) / 2;

        while (left <= right) {
            if (arr[mid] == target)
                return (mid);
            else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
            mid = (left + right) / 2;
        }
        return (-1);
//        throw new NoSuchElementException("There are NO TARGET in the array.");
    }
}
