/*
 * Problem Statement

    You are given an array prices where prices[i] represents the price of a stock
    on the i-th day. You want to maximize your profit by choosing a single day 
    to buy one stock and a later day in the future to sell that stock.

    Input: prices = [7,1,5,3,6,4]
    Output: 5

    Explanation:
    Buy on day 2 (price = 1), sell on day 5 (price = 6), profit = 6 − 1 = 5.
    You cannot sell before buying, so only future days are valid.

    What is required: Find the maximum profit possible. 
    If no profit can be made (prices always decrease), return 0.

*/

public class Array05_BestTimeToBuySellStock {
    public static void main(String[] args) {
        int[] stockPrice = {7,1,5,3,6,4};
        int buyPrice = Integer.MAX_VALUE;
        int profit = 0;

        for (int i = 0; i < stockPrice.length; i++) {
            // Update the minimum price so far
            if(stockPrice[i] < buyPrice){
                buyPrice = stockPrice[i]; 
            }
            
            // Calculate profit if selling today
            int currentProfit = stockPrice[i] - buyPrice;
            profit = Math.max(profit, currentProfit);
        }
        System.out.println("Maximum Profit: " + profit);
    }
}
