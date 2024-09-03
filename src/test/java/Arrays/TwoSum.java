package Arrays;

import java.util.HashMap;
import java.util.Map;


/**Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.*/

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> sum = new HashMap<>();

        for (int i=0;i<nums.length;i++){
            if (sum.containsKey(target-nums[i])){
                return new int[] {sum.get(target-nums[i]),i};
            }

            sum.put(nums[i],i);

        }
        throw new IllegalArgumentException();

            }

    public static void main(String[] args) {
        int[] nums = {7, 2, 7, 15};
        int target = 22;
        int[] result = twoSum(nums, target);

        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
