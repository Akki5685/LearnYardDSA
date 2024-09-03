package Arrays;

/** Given an array nums. We define a running sum of an array as
 runningSum[i] = sum(nums[0]…nums[i]).
 Return the running sum of nums.*/


public class RunningSum {
    public static int[] runningSum(int[] nums) {

        int[] runningSum = new int[nums.length];
        int sum =0;
        for (int i=0;i<nums.length;i++){

            runningSum[i]= sum+= nums[i];

        }
        return runningSum;

    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4}; // Example input
        int[] result = runningSum(nums);

        // Print the result
        System.out.print("Running Sum: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        // Output should be: Running Sum: 1 3 6 10
    }
}
