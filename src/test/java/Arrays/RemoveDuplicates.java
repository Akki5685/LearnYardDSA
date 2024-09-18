package Arrays;
/**Given an integer array nums sorted in non-decreasing order,
 *  remove the duplicates in-place such that each unique element appears only once.
 *  The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
 Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
 Change the array nums such that the first k elements of nums contain the unique elements in the order they were
 present in nums initially. The remaining elements of nums are not important as well as the size of nums.
 Return k.**/
public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        // If the array is empty, return 0
        if (nums.length == 0) {
            return 0;
        }

        int uniqueIndex = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex])
                nums[++uniqueIndex] = nums[i];
        }

        return uniqueIndex + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
        int k = removeDuplicates(nums);

        System.out.println("Number of unique elements: " + k);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
