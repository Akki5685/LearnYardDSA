package Arrays;


public class MajorityElement {
    public static int majorityElement(int[] nums) {

        Integer ans = null;
        int count = 0;

        for (final int num : nums) {
            if (count == 0)
                ans = num;
            count += num == ans ? 1 : -1;
        }

        return ans;

    }
        public static void main(String[] args) {
        int[] nums = {3, 2, 3}; // Example input
        int result = majorityElement(nums);
        System.out.println("Majority Element: " + result); // Output should be 3
    }
}
