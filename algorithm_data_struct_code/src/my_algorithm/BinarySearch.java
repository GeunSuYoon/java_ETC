package my_algorithm;

public class BinarySearch {
    public static int Search(int[] arr, int target)
    {
        int left = 0;
        int right = arr.length - 1;
        int mid = (left + right) / 2;

        while (left <= right)
        {
            if (arr[mid] == target)
                return (mid);
            else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
            mid = (left + right) / 2;
        }
        return (-1);
    }
}
