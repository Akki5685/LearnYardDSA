package Arrays;

/**
 You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of
 the ith integer. The digits are ordered from most significant to least significant in left-to-right order.
 The large integer does not contain any leading 0's.
 Increment the large integer by one and return the resulting array of digits.
*/

 public class PlusOne {
    public static int[] plusOne(int[] digits) {

        for (int i = digits.length-1; i >= 0; i--) {
            if (digits[i] < 9) {
                ++digits[i];
                return digits;
            }
            digits[i] = 0;
        }

        int[] ans = new int[digits.length+1];
        ans[0]=1;
        return ans;

    }

    public static void main(String[] args) {
        int[] digits = {9, 9, 9}; // Example input
        int[] result = plusOne(digits);

        System.out.print("Result: ");
        for (int digit : result) {
            System.out.print(digit + " ");
        }
    }
}
