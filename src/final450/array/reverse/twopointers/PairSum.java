package final450.array.reverse.twopointers;

import java.util.Arrays;
import java.util.List;

public class PairSum {
    // Two pointers technique
    public static int isPairSum(List<Integer> A, int N, int X) {
        int i = 0;
        int j = N - 1;

        while (i < j) {
            if (A.get(i) + A.get(j) == X) return 1;
            else if (A.get(i) + A.get(j) < X) i++;
            else j--;
        }
        return 0;
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(2, 3, 5, 8, 9, 10, 11);
        int val = 17;
        int arrSize = arr.size();
        System.out.println(isPairSum(arr, arrSize, val));
    }
}
