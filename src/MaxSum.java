
import java.util.Arrays;

public class MaxSum {

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, -1, 2, -10, 2, 4};
        System.out.println(Arrays.toString(maximumSum(arr, 8)));
    }

    static int[] maximumSum(int arr[], int no) {
        int maxSum = 0;
        int sum = 0;
        int count, count1;
        for (count = 0; count < no; count++) {
            sum = 0;
            for (count1 = count; count1 < no; count1++) {
                sum += arr[count1];
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        System.out.println(maxSum);
        int[] ar = {maxSum,2,3};
        return ar;
    }
}