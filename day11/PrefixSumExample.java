public class PrefixSumExample {
    public static int[] computePrefixSum(int[] nums) {
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
        return prefix;
    }

    public static int getRangeSum(int[] prefix, int left, int right) {
        if (left == 0) return prefix[right];
        return prefix[right] - prefix[left - 1];
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 1, 3, 7};
        int[] prefix = computePrefixSum(nums);
        System.out.println("Sum from index 1 to 3: " + getRangeSum(prefix, 1, 3)); // Output: 8
    }
}
