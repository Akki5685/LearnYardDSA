package Arrays;

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
