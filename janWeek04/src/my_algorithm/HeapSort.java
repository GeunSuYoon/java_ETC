package my_algorithm;

public class HeapSort {
    public static void Sort(int[] arr)
    {
        MaxHeapSorting(arr, arr.length);
    }
    public static void MaxHeapSorting(int[] arr, int heapSize)
    {
        if (heapSize == 1)
            return ;
        for (int heapCnt = heapSize / 2 - 1; heapCnt >= 0; heapCnt--)
            MaxHeapify(arr, heapCnt, heapSize);
        Swap(arr, 0, heapSize - 1);
        MaxHeapSorting(arr, heapSize - 1);
    }

    private static void MaxHeapify(int[] arr, int node, int heap_size){
        int biggest;
        int left;
        int right;

        biggest = node;
        left = 2 * node + 1;
        right = 2 * node + 2;
        if (left < heap_size &&  arr[biggest] < arr[left])
            biggest = left;
        if (right < heap_size && arr[biggest] < arr[right])
            biggest = right;
        if (biggest != node)
            Swap(arr, biggest, node);
    }

    private static void Swap(int[] arr, int a, int b){
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
