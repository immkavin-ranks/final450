package final450.array.reverse;

public class ReverseArrayExtraArray {
    public static void reverseArrayExtraArray(int[] arr) {
        int[] reversedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArr[i] = arr[arr.length - i - 1];
        }

        for (int i : reversedArr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] originalArr = { 1, 2, 3, 4, 5 };
        reverseArrayExtraArray(originalArr);
    }
}

//Time O(n)
//Space O(n)