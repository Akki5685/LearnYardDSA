package Arrays;

import java.util.HashMap;
import java.util.Map;

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
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);

        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
