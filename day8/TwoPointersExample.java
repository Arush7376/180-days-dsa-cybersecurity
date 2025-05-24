public class TwoPointersExample {
    public static boolean hasPairWithSum(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) return true;
            else if (sum < target) left++;
            else right--;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 5, 7, 10};
        int target = 9;
        System.out.println(hasPairWithSum(numbers, target));
    }
}
