package my_algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Djikstra {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final int            MAX_NODE_NUMBER = 10;
    static int[][]              map = new int[MAX_NODE_NUMBER][MAX_NODE_NUMBER];
    static int[]                visited = new int[MAX_NODE_NUMBER];
    static int                  inputNodeNumber;
    static int                  pathSize;
    static int                  startNode;
    static int                  nodeA = 0;
    static int                  nodeB = 0;
    static int                  pathLen = 0;

    public static int[] FindPath() throws IOException {
        int[]   returnPath;

        try {
            inputNodeNumber = Integer.parseInt(br.readLine());
            pathSize = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (int mapCnt = 0; mapCnt < inputNodeNumber; mapCnt++)
        {
            for (int mapCnt2 = 0; mapCnt2 < inputNodeNumber; mapCnt2++)
            {
                if (mapCnt != mapCnt2)
                    map[mapCnt][mapCnt2] = Integer.MAX_VALUE;
            }
        }
        for (int cnt = 0; cnt < pathSize; cnt++)
        {
            InputMap();
            AddPath();
        }
        try {
            startNode = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        returnPath = new int[inputNodeNumber];
        Arrays.fill(returnPath, Integer.MAX_VALUE);
        returnPath[startNode] = 0;
        MakePath(returnPath, startNode, 0);
        PrintPath(returnPath);
        return (returnPath);
    }

    private static void InputMap() throws IOException
    {
        try {
            nodeA = Integer.parseInt(br.readLine());
            nodeB = Integer.parseInt(br.readLine());
            pathLen = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void AddPath()
    {
        map[nodeA][nodeB] = pathLen;
        map[nodeB][nodeA] = pathLen;
    }

    private static void MakePath(int[] path, int nowNode, int visitCnt)
    {
        if (visitCnt == inputNodeNumber)
            return ;
        int minPath = Integer.MAX_VALUE;
        int nxtNode = 0;

        visited[nowNode] = 1;
        for (int destNode = 0; destNode < inputNodeNumber; destNode++)
        {
            if (map[nowNode][destNode] + path[nowNode] < path[destNode] && visited[destNode] == 0)
            {
                path[destNode] = map[nowNode][destNode];
                if (path[destNode] < minPath)
                {
                    minPath = path[destNode];
                    nxtNode = destNode;
                }
            }
        }
        MakePath(path, nxtNode, visitCnt + 1);
    }

    private static void PrintPath(int[] path)
    {
        for (int pathCnt = 0; pathCnt < inputNodeNumber; pathCnt++)
        {
            if (pathCnt == startNode || path[pathCnt] == Integer.MAX_VALUE)
                continue;
            System.out.printf("node[%d] to [%d] is [%d]\n", startNode, pathCnt, path[pathCnt]);
        }
    }

}
