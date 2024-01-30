package my_algorithm;

public class InsertionSort {
    public static void  insertionSort(int[] arr){
        int arrLen = arr.length;

        for (int nowIdx = 1; nowIdx < arrLen; nowIdx++){
            int compareIdx = nowIdx - 1;
            int nowVal = arr[nowIdx];

            while (compareIdx >= 0 && arr[compareIdx] > nowVal){
                arr[compareIdx + 1] = arr[compareIdx];
                compareIdx--;
            }
            arr[compareIdx + 1] = nowVal;
        }
    }
}
