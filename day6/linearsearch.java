// File: Day06_LinearSearch.java

import java.util.*;

public class linearsearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {4, 2, 7, 9, 1, 6};
        int target = 9;

        int index = linearSearch(arr, target);
        if (index != -1)
            System.out.println("Target found at index: " + index);
        else
            System.out.println("Target not found");
    }

    // Linear Search
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }
}
