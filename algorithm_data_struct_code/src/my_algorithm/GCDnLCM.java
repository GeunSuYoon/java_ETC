package my_algorithm;

public class GCDnLCM {
    public static int   GCD(int a, int b)
    {
        int bigger = Math.max(a, b);
        int smaller = Math.min(a, b);
        int r;
        while (true)
        {
            r = bigger % smaller;
            if (r == 0)
                return (smaller);
            bigger = smaller;
            smaller = r;
        }
    }

    public static int   LCM(int a, int b)
    {
        int divisor = GCD(a, b);
        return (a * b / divisor);
    }
}
