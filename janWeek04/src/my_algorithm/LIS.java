package my_algorithm;

public class LIS {
    public static int FindSequence(int[] arr)
    {
        int     arrLen = arr.length;
        int[]   dp = new int[arrLen];

        for (int comp = 0; comp < arrLen - 1; comp++)
        {
            for (int idx = comp + 1; idx < arrLen; idx++)
            {
                if(arr[idx] > arr[comp])
                    dp[idx] = Math.max(dp[idx], dp[comp] + 1);
            }
        }
        int retLen = 0;
        for (int cnt = 0; cnt < arrLen; cnt++)
        {
            if (retLen < dp[cnt])
                retLen = dp[cnt];
        }
        return (retLen + 1);
    }
}
