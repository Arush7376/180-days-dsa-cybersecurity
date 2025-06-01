public class FindUnique {
    public static int findSingle(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;  // XOR accumulates and cancels out duplicates
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 4, 5, 3, 4};
        System.out.println("The unique number is: " + findSingle(nums));  // Output: 2
    }
}
