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
        int leftLen = mid - left + 1;
        int rightLen = right - mid;
        int totalLen = right - left + 1;
        int leftCnt = 0;
        int rightCnt = 0;
        int arrCnt = 0;
        int[] leftArr = Arrays.copyOfRange(arr, left, left + leftLen);
        int[] rightArr = Arrays.copyOfRange(arr, mid + 1, mid + 1 + rightLen);

        while (arrCnt < totalLen) {
            while (leftCnt < leftLen && rightCnt < rightLen) {
                if (leftArr[leftCnt] < rightArr[rightCnt]) {
                    arr[left + arrCnt] = leftArr[leftCnt];
                    leftCnt++;
                }
                else {
                    arr[left + arrCnt] = rightArr[rightCnt];
                    rightCnt++;
                }
                arrCnt++;
            }
            if (leftCnt == leftLen)
            {
                while (rightCnt < rightLen) {
                    arr[left + arrCnt] = rightArr[rightCnt];
                    rightCnt++;
                    arrCnt++;
                }
            }
            while (leftCnt < leftLen) {
                arr[left + arrCnt] = leftArr[leftCnt];
                leftCnt++;
                arrCnt++;
            }
        }
    }
    public static void merge_swap(int[] arr, int a, int b){
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
