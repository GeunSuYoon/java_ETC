package my_algorithm;

import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] arr, int left, int right){
        if (right <= left)
            return ;
        int mid = (left + right) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }
    public static void merge(int[] arr, int left, int mid, int right){
        int left_len = mid - left + 1;
        int right_len = right - mid;
        int total_len = right - left + 1;
        int left_cnt = 0;
        int right_cnt = 0;
        int[] left_arr = Arrays.copyOfRange(arr, left, left + left_len);
        int[] right_arr = Arrays.copyOfRange(arr, mid + 1, mid + 1 + right_len);

        for (int arr_cnt = 0; arr_cnt < total_len; arr_cnt++){
            if (left_cnt == left_len)
            {
                arr[left + arr_cnt] = right_arr[right_cnt];
                right_cnt++;
            }
            else if (right_cnt == right_len)
            {
                arr[left + arr_cnt] = left_arr[left_cnt];
                left_cnt++;
            }
            else if (left_arr[left_cnt] < right_arr[right_cnt])
            {
                arr[left + arr_cnt] = left_arr[left_cnt];
                left_cnt++;
            }
            else
            {
                arr[left + arr_cnt] = right_arr[right_cnt];
                right_cnt++;
            }
        }
    }
    public static void merge_swap(int[] arr, int a, int b){
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
