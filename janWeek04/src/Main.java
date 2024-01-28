import java.io.IOException;
import java.util.Arrays;

import my_algorithm.*;

public class Main {
    public static int   arr_len = 9;
    public static int   ele_max = 15;
    public static void main(String[] args) throws IOException {
        BinarySearch    BS = new BinarySearch();
        HashTable       HT = new HashTable();
        HeapSort        HS = new HeapSort();
        LCA             lca = new LCA();
        LIS             lis = new LIS();
        MergeSort       ms = new MergeSort();

        int[] arr = new int[arr_len];
        makeArray(arr);
        lis_runner(arr, lis);
        ms_runner(arr, ms);
    }
    public static void  bs_runner(int[] arr, BinarySearch BS) {
        int[] bsArr = arr.clone();
        Arrays.sort(bsArr);
        System.out.println("==Binary Search==");
        printArr(bsArr);
        for (int i = 0; i < ele_max; i++) {
            if (BS.bs(arr, i) >= 0)
                System.out.printf("Target [%d] at [%d]\n", i, BS.bs(arr, i));
        }
        System.out.printf("\n");
    }
    public static void  lis_runner(int[] arr, LIS lis) {
        int[]   lsArr = arr.clone();
        System.out.println("==Longest Increasing Sequence==");
        printArr(lsArr);
        System.out.printf("LIS [%d]", lis.longestInscresingSequence(arr));
        System.out.printf("\n");
    }
    public static void ms_runner(int[] arr, MergeSort ms){
        int[]   msArr = arr.clone();
        System.out.println("==Merge Sort==");
        printArr(msArr);
        ms.mergeSort(msArr, 0, msArr.length - 1);
        printArr(msArr);
        System.out.printf("\n");
    }
    public static void  makeArray(int[] arr){
        int cnt = 0;
        int ele;

        while (cnt < arr_len)
        {
            ele = (int) (Math.random() * ele_max);
            if (check_new(arr, ele))
            {
                arr[cnt] = ele;
                cnt++;
            }
        }
    }
    public static boolean   check_new(int[] arr, int new_ele)
    {
        for (int j : arr) {
            if (j == new_ele)
                return (false);
        }
        return (true);
    }
    public static int   randomChildSelector(int[] arr){
        int idx = (int)(Math.random() * arr_len);
        return (arr[idx]);
    }
    public static void printArr(int[] arr){
        System.out.printf("Arr : ");
        for (int element : arr)
            System.out.printf("%d ", element);
        System.out.printf("\n");
    }
}
