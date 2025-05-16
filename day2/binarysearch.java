

import java.util.Arrays;
import java.util.Scanner;

public class binarysearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }

        return -1; // Not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid array size.");
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        Arrays.sort(arr); // Binary Search needs sorted array

        System.out.print("Enter target value to search: ");
        int target = sc.nextInt();

        int result = binarySearch(arr, target);
        if (result != -1) {
            System.out.println("Target found at index (sorted array): " + result);
        } else {
            System.out.println("Target not found.");
        }

        sc.close();
    }
}
