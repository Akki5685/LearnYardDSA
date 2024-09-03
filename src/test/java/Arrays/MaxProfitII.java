package Arrays;

public class MaxProfitII {
    public static int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                max += prices[i] - prices[i - 1];
        }
        return max;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4}; // Example input
        int result = maxProfit(prices);
        System.out.println("Maximum Profit: " + result); // Output should be 7
    }
}
