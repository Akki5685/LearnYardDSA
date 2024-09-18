package Arrays;

import java.util.HashMap;

/**
 * Given an array of integers nums and an integer k,
 * return the total number of subarrays whose sum equals to k.
 * A subarray is a contiguous non-empty sequence of elements within an array.
 */


public class SubarraySumEqualsK {
    public static int subarraySum(int[] nums, int k) {
        // Hash map to store (cumulative sum, frequency of the sum)
        HashMap<Integer, Integer> sum_count = new HashMap<>();
        sum_count.put(0, 1);  // Initial case: sum 0 occurs once

        int cumulativeSum = 0;
        int result = 0;

        // Iterate through the array
        for (int num : nums) {

            // Update the cumulative sum
            cumulativeSum += num;

            // Check if (cumulativeSum - k) exists in the hash map
            if (sum_count.containsKey(cumulativeSum - k)) {
                result += sum_count.get(cumulativeSum - k);  // Add the frequency of the matching sum
            }

            // Update the frequency of the current cumulative sum in the hash map
            sum_count.put(cumulativeSum, sum_count.getOrDefault(cumulativeSum, 0) + 1);

        }

        return result;
    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int k = 3;
        System.out.println("Total number of subarrays: " + subarraySum(nums, k));  // Output: 2
    }
}