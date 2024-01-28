package my_algorithm;

import java.util.ArrayList;

public class LIS {
    public static int   longestInscresingSequence(int[] arr){
        int arr_len = arr.length;
        int[]   dp = new int[arr_len];
//        int[]   retArr = new int[arr_len];

        for (int idx = 0; idx < arr_len - 1; idx++){
            for (int comp = idx + 1; comp < arr_len; comp++){
                if(arr[comp] > arr[idx])
                    dp[comp] = Math.max(dp[comp], dp[idx] + 1);
            }
        }
        int retLen = 0;
        for (int cnt = 0; cnt < arr_len; cnt++)
            if (retLen < dp[cnt])
                retLen = dp[cnt];
        return (retLen + 1);
    }
}
