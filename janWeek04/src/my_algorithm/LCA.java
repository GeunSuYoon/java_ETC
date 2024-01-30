package my_algorithm;

import java.util.Vector;

public class LCA {
    public static int lowestCommonAncestor(int[] arr, int nodeA, int nodeB){
        int arrLen = arr.length;
        int nodeAIdx = -1;
        int nodeBIdx = -1;
        Vector<Integer> depthList = new Vector<>(arrLen);

        for (int cnt = 0; cnt < arrLen; cnt++){
            if (arr[cnt] == nodeA)
                nodeAIdx = cnt;
            if (arr[cnt] == nodeB)
                nodeBIdx = cnt;
        }
        if (nodeAIdx < 0 || nodeBIdx < 0)
            return (-1);
        makeDepth(depthList, arrLen);
        while (true){
            if (depthList.get(nodeAIdx) != depthList.get(nodeBIdx)){
                if (depthList.get(nodeAIdx) < depthList.get(nodeBIdx))
                    nodeBIdx = (nodeBIdx + 1) / 2 - 1;
                else
                    nodeAIdx = (nodeAIdx + 1) / 2 - 1;
            }
            else{
                if (nodeAIdx == nodeBIdx)
                    return (arr[nodeAIdx]);
                nodeAIdx = (nodeAIdx + 1) / 2 - 1;
                nodeBIdx = (nodeBIdx + 1) / 2 - 1;
            }
        }
    }
    public static void  makeDepth(Vector<Integer> depthList, int arrLen){
        depthList.add(0);
        for (int cnt = 1; cnt < arrLen; cnt++)
            depthList.add(depthList.get((cnt - 1) / 2) + 1);
    }
}
