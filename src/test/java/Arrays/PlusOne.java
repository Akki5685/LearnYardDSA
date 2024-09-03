package Arrays;

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
