public class MaximumSubarray {

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        Result result = findMaxSubarray(nums);
        
        System.out.println("Maximum Subarray Sum: " + result.maxSum);
        System.out.print("Subarray: [");
        for (int i = 0; i < result.subarray.length; i++) {
            System.out.print(result.subarray[i]);
            if (i < result.subarray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    // Helper class to store both maxSum and subarray
    static class Result {
        int maxSum;
        int[] subarray;
        
        Result(int maxSum, int[] subarray) {
            this.maxSum = maxSum;
            this.subarray = subarray;
        }
    }

    // Kadane's Algorithm to find max subarray sum and the subarray
    public static Result findMaxSubarray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int start = 0, end = 0;
        int tempStart = 0;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }

            if (currentSum < 0) {
                currentSum = 0;
                tempStart = i + 1;
            }
        }

        // Extract the subarray
        int[] subarray = new int[end - start + 1];
        System.arraycopy(nums, start, subarray, 0, subarray.length);

        return new Result(maxSum, subarray);
    }
}