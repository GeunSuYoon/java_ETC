package my_algorithm;

public class QuickSort {
    public static void  Sort(int[] arr)
    {
        int arrLen = arr.length;
        DoSort(arr, 0, arrLen - 1);
    }
    private static void DoSort(int[] arr, int left, int right)
    {
        if (right <= left)
            return ;

        int part = Partition(arr, left, right);
        DoSort(arr, left, part - 1);
        DoSort(arr, part + 1, right);
    }
    private static int Partition(int[] arr, int left, int right){
        int mid = (left + right) / 2;
        int pivot = arr[mid];
        int smallCnt = left;
        int bigCnt = right;

        Swap(arr, mid, left);
        while (smallCnt < bigCnt)
        {
            while (pivot < arr[bigCnt])
                bigCnt--;
            while (arr[smallCnt] <= pivot && smallCnt < bigCnt)
                smallCnt++;
            Swap(arr, smallCnt, bigCnt);
        }
        Swap(arr, left, smallCnt);
        return (smallCnt);
    }
    private static void Swap(int[] arr, int a, int b){
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
