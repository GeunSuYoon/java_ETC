package my_algorithm;

public class HeapSort {
    public static void maxHeapSort(int[] arr){
        maxHeapSorting(arr, arr.length);
    }
//    public static void minHeapSort(int[] arr){
//
//    }
//
    public static void maxHeapSorting(int[] arr, int heap_size){
//        int heap_size = arr.length;
        if (heap_size == 0)
            return ;
        for (int cnt = heap_size / 2 - 1; cnt >= 0; cnt--)
            maxHeapify(arr, cnt, heap_size);
        heap_swap(arr, 0, heap_size - 1);
        maxHeapSorting(arr, heap_size - 1);
    }

    public static void maxHeapify(int[] arr, int node, int heap_size){
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
        if (biggest != node){
            heap_swap(arr, biggest, node);
            maxHeapify(arr, biggest, heap_size);
        }
    }

    public static void  heap_swap(int[] arr, int a, int b){
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
