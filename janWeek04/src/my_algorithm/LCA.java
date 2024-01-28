package my_algorithm;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Vector;

public class LCA {
    public static int   lowsetCommonAncestor(int[] arr, int child_a, int child_b){
        int arr_len = arr.length;
        int child_a_idx = -1;
        int child_b_idx = -1;
        Vector<Integer> depth_list = new Vector<>(arr_len);

        for (int cnt = 0; cnt < arr_len; cnt++){
            if (arr[cnt] == child_a)
                child_a_idx = cnt;
            if (arr[cnt] == child_b)
                child_b_idx = cnt;
        }
        if (child_a_idx < 0 || child_b_idx < 0)
            return (-1);
//            throw new NoSuchElementException("Bad Child\n");
        makeDepth(depth_list, arr_len);
        while (true){
            if (depth_list.get(child_a_idx) != depth_list.get(child_b_idx)){
                if (depth_list.get(child_a_idx) < depth_list.get(child_b_idx))
                    child_b_idx = (child_b_idx + 1) / 2 - 1;
                else
                    child_a_idx = (child_a_idx + 1) / 2 - 1;
            }
            else{
                if (child_a_idx == child_b_idx)
                    return (arr[child_a_idx]);
                child_a_idx = (child_a_idx + 1) / 2 - 1;
                child_b_idx = (child_b_idx + 1) / 2 - 1;
            }
        }
    }
    public static void  makeDepth(Vector<Integer> depth_list, int arr_len){
        depth_list.add(0);
        for (int cnt = 1; cnt < arr_len; cnt++)
            depth_list.add(depth_list.get((cnt - 1) / 2) + 1);
    }
}
