package Arrays;


/**You are given an array prices where prices[i] is the price of a given stock on the ith day.
 You want to maximize your profit by choosing a single day to buy one stock and choosing a different
 day in the future to sell that stock.
 Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
*/
 public class MaxProfit {
    public static int maxProfit(int[] prices) {
       if ( prices==null || prices.length==0){
           return 0;
       }

       int minPrice= Integer.MAX_VALUE;
       int maxProfit=0;

        for (int price: prices) {

            if(price<minPrice)
                minPrice=price;


            if (maxProfit<price-minPrice)
                maxProfit=price-minPrice;


        }

        return maxProfit;


    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Maximum Profit: " + maxProfit(prices));  // Output: 5
    }
}
