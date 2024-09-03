package Arrays;

/**
 * Given an array of integers nums, calculate the pivot index of this array.
 * The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal
 * to the sum of all the numbers strictly to the index's right.
 * If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left.
 * This also applies to the right edge of the array.
 * Return the leftmost pivot index. If no such index exists, return -1.
 * */

public class PivotValue {
    public static int pivotIndex(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;
        for (int num : nums)
            totalSum += num;
        for (int num : nums) {
            int rightSum = totalSum - leftSum - num;

            if (rightSum == leftSum) return num;

            leftSum += num;
        }


        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6}; // Example input
        int result = pivotIndex(nums);
        System.out.println("Pivot Value: " + result); // Output should be 3
    }
}
