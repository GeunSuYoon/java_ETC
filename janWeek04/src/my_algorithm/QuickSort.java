package my_algorithm;

public class QuickSort {
    public static void  quickSort(int[] arr){
        int arrLen = arr.length;
        quickSorting(arr, 0, arrLen - 1);
    }
    public static void  quickSorting(int[] arr, int left, int right){
        if (right <= left)
            return ;

        int part = partition(arr, left, right);
        quickSorting(arr, left, part - 1);
        quickSorting(arr, part + 1, right);
    }
    public static int  partition(int[] arr, int left, int right){
        int mid = (left + right) / 2;
        int pivot = arr[mid];
        swap(arr, mid, left);
        int smallCnt = left;
        int bigCnt = right;

        while (smallCnt < bigCnt){
            while (pivot < arr[bigCnt])
                bigCnt--;
            while (arr[smallCnt] <= pivot && smallCnt < bigCnt)
                smallCnt++;
            swap(arr, smallCnt, bigCnt);
        }
        swap(arr, left, smallCnt);
        return (smallCnt);
    }
    public static void  swap(int[] arr, int a, int b){
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
