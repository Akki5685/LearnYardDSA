package Arrays;

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

            if (maxProfit>minPrice-price)
                maxProfit=price-minPrice;

        }

        return maxProfit;


    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Maximum Profit: " + maxProfit(prices));  // Output: 5
    }
}
