package my_algorithm;

public class LCA {
    public static int FindAncestor(int[] arr, int nodeA, int nodeB)
    {
        int     arrLen = arr.length;
        int     nodeAIdx = -1;
        int     nodeBIdx = -1;
        int[]   depthList = new int[arrLen];

        for (int cnt = 0; cnt < arrLen; cnt++)
        {
            if (arr[cnt] == nodeA)
                nodeAIdx = cnt;
            if (arr[cnt] == nodeB)
                nodeBIdx = cnt;
        }
        if (nodeAIdx < 0 || nodeBIdx < 0)
            return (-1);
        makeDepth(depthList, arrLen);
        while (true)
        {
            if (depthList[nodeAIdx] != depthList[nodeBIdx])
            {
                if (depthList[nodeAIdx] < depthList[nodeBIdx])
                    nodeBIdx = (nodeBIdx + 1) / 2 - 1;
                else
                    nodeAIdx = (nodeAIdx + 1) / 2 - 1;
            }
            else
            {
                if (nodeAIdx == nodeBIdx)
                    return (arr[nodeAIdx]);
                nodeAIdx = (nodeAIdx + 1) / 2 - 1;
                nodeBIdx = (nodeBIdx + 1) / 2 - 1;
            }
        }
    }
    public static void  makeDepth(int[] depthList, int arrLen)
    {
        depthList[0] = 0;
        for (int cnt = 1; cnt < arrLen; cnt++)
            depthList[cnt] = depthList[(cnt - 1) / 2] + 1;
    }
}
