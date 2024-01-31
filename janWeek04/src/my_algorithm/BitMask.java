package my_algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BitMask {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final int            BIT_LEN = 10;
    static int                  inputA;
    static int                  inputB;

    static int[]                bitA = new int[BIT_LEN];
    static int[]                bitB = new int[BIT_LEN];
    public static void  CalculBit()
    {

        try {
            inputA = Integer.parseInt(br.readLine());
            inputB = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        ParsingInputToBit();
        PrintBitCalcut();
    }

    private static void ParsingInputToBit()
    {
        int exp = 1;
        for (int bitCnt = 0; bitCnt < BIT_LEN; bitCnt++)
        {
            bitA[BIT_LEN - bitCnt - 1] = (inputA / exp) % 10;
            bitB[BIT_LEN - bitCnt - 1] = (inputB / exp) % 10;
            exp *= 10;
        }
    }

    private static void PrintBitCalcut()
    {
        AndCalcul();
        OrCalcul();
        XorCalcul();
        NACalcul();
        NBCalcul();
    }

    private static void AndCalcul()
    {
        for (int bitCnt = 0; bitCnt < BIT_LEN; bitCnt++)
        {
            if (bitA[bitCnt] == bitB[bitCnt] && bitA[bitCnt] == 1)
                System.out.printf("1");
            else
                System.out.printf("0");
        }
        System.out.println();
    }

    private static void OrCalcul()
    {
        for (int bitCnt = 0; bitCnt < BIT_LEN; bitCnt++)
        {
            if (bitA[bitCnt] == 1 || bitB[bitCnt] == 1)
                System.out.printf("1");
            else
                System.out.printf("0");
        }
        System.out.println();
    }

    private static void XorCalcul()
    {
        for (int bitCnt = 0; bitCnt < BIT_LEN; bitCnt++)
        {
            if (bitA[bitCnt] != bitB[bitCnt])
                System.out.printf("1");
            else
                System.out.printf("0");
        }
        System.out.println();
    }

    private static void NACalcul()
    {
        for (int bitCnt = 0; bitCnt < BIT_LEN; bitCnt++)
        {
            if (bitA[bitCnt] != 1)
                System.out.printf("1");
            else
                System.out.printf("0");
        }
        System.out.println();
    }

    private static void NBCalcul()
    {
        for (int bitCnt = 0; bitCnt < BIT_LEN; bitCnt++)
        {
            if (bitB[bitCnt] != 1)
                System.out.printf("1");
            else
                System.out.printf("0");
        }
        System.out.println();
    }
}
