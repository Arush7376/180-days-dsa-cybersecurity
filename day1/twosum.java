import java.util.*;

public class Day1_ArrayExample {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if(map.containsKey(diff)) {
                return new int[]{ map.get(diff), i };
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] prices = {2, 7, 11, 15};
        int giftCard = 9;
        int[] result = twoSum(prices, giftCard);
        System.out.println("Items at indices: " + result[0] + " and " + result[1]);
    }
}
