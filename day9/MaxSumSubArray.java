public class MaxSumSubArray {
    public static int maxSum(int[] arr, int k) {
        int maxSum = 0, windowSum = 0;

        // Calculate the sum of first window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        maxSum = windowSum;

        // Slide the window
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 1};
        int k = 7;
        System.out.println("Max Sum: " + maxSum(nums, k));
    }
}
