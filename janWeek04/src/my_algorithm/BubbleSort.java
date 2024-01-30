package my_algorithm;

public class BubbleSort {
    public static void  bubbleSort(int[] arr) {
        int arrLen = arr.length;

        for (int fIdx = 0; fIdx < arrLen - 1; fIdx++){
            for (int sIdx = 0; sIdx < arrLen - fIdx - 1; sIdx++){
                if (arr[sIdx] > arr[sIdx + 1])
                    swap(arr, sIdx, sIdx + 1);
            }
        }
    }
    public static void  swap(int[] arr, int a, int b){
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
