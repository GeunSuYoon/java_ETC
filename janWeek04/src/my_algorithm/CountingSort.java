package my_algorithm;

import java.util.ArrayList;

public class CountingSort {
    public static void countingSort(int[] arr) {
        int     arrLen = arr.length;
        int     countLen = MaxElement(arr, arrLen) + 1;
        int[]   count = new int[countLen];
        for (int arrEle : arr) count[arrEle]++;
        for (int countCnt = 1; countCnt < countLen; countCnt++) {
            count[countCnt] += count[countCnt - 1];
        }
        int[]   arrCpy = arr.clone();
        for (int arrCnt = arrLen - 1; arrCnt >= 0; arrCnt--) {
            arr[count[arrCpy[arrCnt]] - 1] = arrCpy[arrCnt];
            count[arrCpy[arrCnt]]--;
        }
    }
    public static int   MaxElement(int[] arr, int arrLen) {
        int retVal = arr[0];
        for (int cnt = 0; cnt < arrLen; cnt++) {
            if (retVal < arr[cnt])
                retVal = arr[cnt];
        }
        return (retVal);
    }
}
