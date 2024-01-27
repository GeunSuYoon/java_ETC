import java.util.NoSuchElementException;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}

public static int binary_search(int[] arr, int target){
    Arrays.sort(arr);

    int left = 0;
    int right = arr.length - 1;
    int mid = (left + right) / 2;

    while (left <= right)
    {
        if (arr[mid] == target)
            return (mid);
        else if (arr[mid] < target)
            left = mid + 1;
        else
            right = mid - 1;
        mid = (left + right) / 2;
    }
    throw new NoSuchElementException("There are NO TARGET in the array.");
}