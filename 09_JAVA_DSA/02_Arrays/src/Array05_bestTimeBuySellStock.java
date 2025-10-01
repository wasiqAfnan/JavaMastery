public class Array05_bestTimeBuySellStock {
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
