import java.io.IOException;
import java.util.Arrays;

import my_algorithm.*;
import my_datastructure.HashTable;

public class Main {
    public static int   arr_len = 9;
    public static int   ele_max = 20;
    public static void main(String[] args) throws IOException {
        BinarySearch    BS = new BinarySearch();
        HashTable       HT = new HashTable();
        HeapSort        HS = new HeapSort();
        LCA             lCA = new LCA();
        LIS             lIS = new LIS();
        MergeSort       MS = new MergeSort();
        QuickSort       QS = new QuickSort();
        InsertionSort   IS = new InsertionSort();
        BubbleSort      BuS = new BubbleSort();
        CountingSort    CS = new CountingSort();
        RadixSort       RS = new RadixSort();
        Djikstra        DK = new Djikstra();
        BitMask         BM = new BitMask();
        int[]           arr = new int[arr_len];

        makeArray(arr);
//        lis_runner(arr, lIS);
//        hs_runner(arr, HS);
//        ms_runner(arr, MS);
//        qs_runner(arr, QS);
//        is_runner(arr, IS);
//        bus_runner(arr, BuS);
//        cs_runner(arr, CS);
//        rs_runner(arr, RS);
//        DK.FindPath();
        BM.CalculBit();
    }
    public static void  bs_runner(int[] arr, BinarySearch BS) {
        int[] bsArr = arr.clone();
        Arrays.sort(bsArr);
        System.out.println("==Binary Search==");
        printArr(bsArr);
        for (int i = 0; i < ele_max; i++) {
            if (BS.Search(arr, i) >= 0)
                System.out.printf("Target [%d] at [%d]\n", i, BS.Search(arr, i));
        }
        System.out.printf("\n");
    }
    public static void hs_runner(int[] arr, HeapSort HS){
        int[]   hsArr = arr.clone();
        System.out.println("==Heap Sort==");
        printArr(hsArr);
        HS.Sort(hsArr);
        printArr(hsArr);
        System.out.printf("\n");
    }
    public static void  lis_runner(int[] arr, LIS lIS) {
        int[]   lsArr = arr.clone();
        System.out.println("==Longest Increasing Sequence==");
        printArr(lsArr);
        System.out.printf("LIS [%d]", lIS.FindSequence(arr));
        System.out.printf("\n");
    }
    public static void ms_runner(int[] arr, MergeSort MS){
        int[]   msArr = arr.clone();
        System.out.println("==Merge Sort==");
        printArr(msArr);
        MS.Sort(msArr, 0, msArr.length - 1);
        printArr(msArr);
        System.out.printf("\n");
    }
    public static void  qs_runner(int[] arr, QuickSort QS){
        int[]   qsArr = arr.clone();
        System.out.println("==Quick Sort==");
        printArr(qsArr);
        QS.Sort(qsArr);
        printArr(qsArr);
        System.out.printf("\n");
    }
    public static void  is_runner(int[] arr, InsertionSort IS){
        int[]   isArr = arr.clone();
        System.out.println("==Insertion Sort==");
        printArr(isArr);
        IS.Sort(isArr);
        printArr(isArr);
        System.out.printf("\n");
    }
    public static void  bus_runner(int[] arr, BubbleSort BuS){
        int[]   bsArr = arr.clone();
        System.out.println("==Bubble Sort==");
        printArr(bsArr);
        BuS.Sort(bsArr);
        printArr(bsArr);
        System.out.printf("\n");
    }

    public static void  cs_runner(int[] arr, CountingSort CS) {
        int[]   csArr = arr.clone();
        System.out.println("==Counting Sort==");
        printArr(csArr);
        CS.Sort(csArr);
        printArr(csArr);
        System.out.printf("\n");
    }
    public static void rs_runner(int[] arr, RadixSort RS) {
        int[] rsArr = {170, 45, 75, 90, 802, 24, 2, 66};
        System.out.println("==Radix Sort==");
        printArr(rsArr);
        RS.Sort(rsArr);
        printArr(rsArr);
        System.out.printf("\n");
    }
    public static void  makeArray(int[] arr){
        int cnt = 0;
        int ele;

        while (cnt < arr_len)
        {
            ele = (int) (Math.random() * ele_max);
            if (check_new(arr, ele)) {
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
