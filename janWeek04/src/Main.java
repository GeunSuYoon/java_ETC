import java.util.Arrays;
import java.util.NoSuchElementException;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
import  my_algorithm.BinarySearch;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[5];
        BinarySearch BS = new BinarySearch();
        int cnt = 0;
        int ele;

        while (cnt < 5)
        {
            ele = (int) (Math.random() * 10);
            if (check_new(arr, ele))
            {
                arr[cnt] = ele;
                cnt++;
            }
        }
        Arrays.sort(arr);
        for (int i = 0; i < 5; i++)
            System.out.printf("%d ", arr[i]);
        System.out.printf("\n");
        bs_runner(arr, BS);
    }
    public static void  bs_runner(int[] arr, BinarySearch BS)
    {
        System.out.printf("=Binary Search Runner=\n");
        for (int i = 0; i < 10; i++)
        {
            if (BS.bs(arr, i) < 0)
                System.out.printf("No Target\n");
            else
                System.out.printf("Target [%d] at [%d]\n", i, BS.bs(arr, i));
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
}
