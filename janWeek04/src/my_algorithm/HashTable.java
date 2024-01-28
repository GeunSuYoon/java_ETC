package my_algorithm;

import java.io.BufferedReader;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class HashTable {
    static final int    HASH_SIZE = 1000;
    static final int    HASH_LEN = 400;
    static final int    HASH_VAL = 19;

    static int[][]      inputcnt = new int[HASH_SIZE][HASH_LEN];
    static int[]        tablelen = new int[HASH_SIZE];
    static String[][]   strcontainer = new String[HASH_SIZE][HASH_LEN];
    static int          n;
    static String       str;
    public static void  hashing() {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder   sb = new StringBuilder();

        try {
            n = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (int cnt = 0; cnt < n; cnt++)
        {
            try {
                str = br.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            int key = getHashKey(str);
            int check = is_exist(key);

            if (check > 0)
                sb.append(str).append(check).append("\n");
            else
                sb.append("OK").append("\n");
        }
        System.out.println(sb.toString());
        return ;
    }
    public static int   getHashKey(String str)
    {
        int key = 0;
        for (int str_cnt = 0; str_cnt < str.length(); str_cnt++)
            key += str.charAt(str_cnt) * HASH_VAL;
        key = key < 0 ? -key : key;
        return (key % HASH_SIZE);
    }
    public static int   is_exist(int key)
    {
        int len = tablelen[key];

        if (len != 0)
        {
            for (int cnt = 0; cnt < len; cnt++)
            {
                if (str.equals(strcontainer[key][cnt]))
                {
                    inputcnt[key][cnt]++;
                    return (inputcnt[key][cnt]);
                }
            }
        }
        strcontainer[key][tablelen[key]++] = str;
        return (0);
    }
}
