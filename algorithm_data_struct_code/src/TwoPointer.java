
import java.io.InputStream;
import java.util.Scanner;

public class TwoPointer {
    static int      n;
    static long     m;
    static int[]    arr = new int[10000];
    static int      m_case = 0;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextLong();
        for (int arr_cnt = 0; arr_cnt < n; arr_cnt++)
            arr[arr_cnt] = sc.nextInt();
        case_find();
        System.out.printf("%d\n", m_case);
    }

    private static void case_find()
    {
        int front_ptr = 0;
        int sum_between = 0;

        for (int rear_ptr = 0; rear_ptr < n; rear_ptr++) {
            sum_between += arr[rear_ptr];
            if (m < sum_between) {
                while (m < sum_between)
                    sum_between -= arr[front_ptr++];
            }
            if (m == sum_between)
                m_case++;
        }
    }
}