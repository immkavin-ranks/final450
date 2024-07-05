package final450.array.reverse.twopointers;

public class NaiveApproach {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 8, 9, 10, 11 };
        int val = 17;
        System.out.println(isPairSum(arr, arr.length, val));
    }

    private static int isPairSum(int[] A, int N, int X) {
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (i == j) continue;
                if (A[i] + A[j] == X) return 1;
                if (A[i] + A[j] > X) break;
            }
        }
        return 0;
    }
}

//Time O(n^2)
//Space O(1)
//https://www.geeksforgeeks.org/two-pointers-technique/