package my_algorithm;

import java.util.ArrayList;

public class RadixSort {
    public static void  radixSort(int[] arr) {
        int arrLen = arr.length;
        int maxVal = MaxElement(arr, arrLen);
        for (int exp = 1; maxVal / exp > 0; exp *= 10) {
            SortExp(arr, arrLen, exp);
        }
    }
    private static void  SortExp(int[] arr, int arrLen, int exp) {
        int[]   count = new int[10];
        int[]   arrCpy = arr.clone();

        for (int arrCnt = 0; arrCnt < arrLen; arrCnt++) {
            count[(arr[arrCnt] / exp) % 10]++;
        }
        for (int countCnt = 1; countCnt < 10; countCnt++) {
            count[countCnt] += count[countCnt - 1];
        }
        for (int arrCnt = arrLen - 1; arrCnt >= 0; arrCnt--) {
            arr[count[(arrCpy[arrCnt] / exp) % 10] - 1] = arrCpy[arrCnt];
            count[(arrCpy[arrCnt] / exp) % 10]--;
        }
    }
    private static int   MaxElement(int[] arr, int arrLen) {
        int retVal = arr[0];
        for (int cnt = 0; cnt < arrLen; cnt++) {
            if (retVal < arr[cnt])
                retVal = arr[cnt];
        }
        return (retVal);
    }
}
