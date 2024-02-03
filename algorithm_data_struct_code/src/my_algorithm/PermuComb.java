package my_algorithm;

import java.util.Arrays;

public class PermuComb {
    final static int    MAX_LEN = 10;
    static int[]        subset = new int[MAX_LEN];
    static int          permutSize = 0;
    static int          combSize = 0;
    public static int   Permutation(int[] arr, int n, int r)
    {
        Arrays.fill(subset, -1);
        permutSize = 0;
        FindPermut(arr, n, r, 0);
        return (permutSize);
    }

    private static void FindPermut(int[] arr, int n, int r, int nowIdx)
    {
        if (nowIdx == r)
        {
            permutSize++;
            PrintSubset(arr, r);
            return ;
        }
        for (int arrCnt = 0; arrCnt < n; arrCnt++)
        {
            int idxChecker = 0;
            for (int subsetCnt = 0; subsetCnt < nowIdx; subsetCnt++)
            {
                if (subset[subsetCnt] == arrCnt)
                {
                    idxChecker = 1;
                    break ;
                }
            }
            if (idxChecker == 0)
            {
                subset[nowIdx] = arrCnt;
                FindPermut(arr, n, r, nowIdx + 1);
                subset[nowIdx] = -1;
            }
        }
    }

    public static int   Combination(int[] arr, int n, int r)
    {
        Arrays.fill(subset, -1);
        combSize = 0;
        FindComb(arr, n, r, 0);
        return (combSize);
    }

    private static void FindComb(int[] arr, int n, int r, int nowIdx)
    {
        if (nowIdx == r)
        {
            combSize++;
            PrintSubset(arr, r);
            return ;
        }
        int subsetCnt;
        for (subsetCnt = nowIdx == 0 ? 0 : subset[nowIdx - 1] + 1; subsetCnt < n - (r - nowIdx - 1); subsetCnt++)
        {
            subset[nowIdx] = subsetCnt;
            FindComb(arr, n, r, nowIdx + 1);
        }
    }

    private static void PrintSubset(int[]arr, int r)
    {
        for (int setCnt = 0; setCnt < r; setCnt++)
            System.out.printf("%d ", arr[subset[setCnt]]);
        System.out.println();
    }
}
