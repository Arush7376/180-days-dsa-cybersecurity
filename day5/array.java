import java.util.*;

public class array {

    // Entry point
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Sample array for practice
        int[] nums = {12, 345, 2, 6, 7896};

        System.out.println("Original Array: " + Arrays.toString(nums));

        // Reverse the array
        reverseArray(nums.clone());

        // Find maximum and minimum
        findMaxMin(nums);

        // Count even digits
        countEvenDigitNumbers(nums);

        // Find duplicates
        findDuplicates(new int[]{1, 2, 3, 1, 3, 6, 6});
    }

    // Reverse an array
    public static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }

    // Find max and min
    public static void findMaxMin(int[] arr) {
        int max = arr[0], min = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        System.out.println("Max: " + max + ", Min: " + min);
    }

    // Count numbers with even number of digits
    public static void countEvenDigitNumbers(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (String.valueOf(num).length() % 2 == 0) {
                count++;
            }
        }
        System.out.println("Count of numbers with even digits: " + count);
    }

    // Find duplicates in array
    public static void findDuplicates(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for (int num : arr) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }
        System.out.println("Duplicates: " + duplicates);
    }
}
