package my_algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HashTable {
    static final int    HASH_SIZE = 1000;
    static final int    HASH_LEN = 400;
    static final int    HASH_VAL = 19;

    static int[][]      HashTable = new int[HASH_SIZE][HASH_LEN];
    static int[]        TableLen = new int[HASH_SIZE];
    static String[][]   Data = new String[HASH_SIZE][HASH_LEN];
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
            int check = isExist(key);

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
    public static int isExist(int key)
    {
        int len = TableLen[key];

        if (len != 0) {
            for (int cnt = 0; cnt < len; cnt++) {
                if (str.equals(Data[key][cnt])) {
                    HashTable[key][cnt]++;
                    return (HashTable[key][cnt]);
                }
            }
        }
        Data[key][TableLen[key]++] = str;
        return (0);
    }
}
