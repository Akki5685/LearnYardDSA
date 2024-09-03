package Arrays;

import java.util.Arrays;

public class SortedSquares {

    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] results = new int[n];

        int left = 0;
        int right = n - 1;
        int position = n - 1;


        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            // Compare squares and place in result
            if (leftSquare > rightSquare) {
                results[position--] = leftSquare;
                left++;
            } else {
                results[position--] = rightSquare;
                right--;
            }

        }
        return results;
    }

    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10}; // Example input
        int[] result = sortedSquares(nums);
        System.out.println(Arrays.toString(result)); // Output should be [0, 1, 9, 16, 100]
    }
}
