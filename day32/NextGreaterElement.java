import java.util.Stack;
import java.util.Arrays;

public class NextGreaterElement {
    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();
        
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums[i]) {
                stack.pop();
            }
            res[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(nums[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 2, 25};
        System.out.println("Next Greater Elements: " + Arrays.toString(nextGreaterElements(nums)));
        // Output: [5, 25, 25, -1]
    }
}
