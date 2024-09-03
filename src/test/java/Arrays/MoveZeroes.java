package Arrays;

/** Given an integer array nums, move all 0's to the end of it while
 maintaining the relative order of the non-zero elements.
 Note that you must do this in-place without making a copy of the array.
*/
 public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int i = 0;

        for (int num : nums)
            if (num != 0)
                nums[i++] = num;


        while(i< nums.length)
            nums[i++]=0;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println("Array after moving zeroes: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
