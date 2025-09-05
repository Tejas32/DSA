/*You're given an array of integers prices, where prices[i] is the price of a given stock on the i 
th
  day. Your goal is to design an algorithm to find the maximum profit you can achieve. You are only allowed to complete at most one transaction (i.e., buy one and sell one share of the stock).

You cannot sell a stock before you buy one.

Example
Input: prices = [7, 1, 5, 3, 6, 4]

Output: 5

Explanation: The maximum profit is achieved by buying on day 2 (price = 1) and selling on day 5 (price = 6), resulting in a profit of 6−1=5. */

public class BuySellStocks {

    public static int maxProfit(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit =0;
        for(int i=0;i<prices.length;i++) {
            if(buyPrice < prices[i]) { //profit
                int profit = prices[i] - buyPrice; //today's profit
                maxProfit = Math.max(maxProfit, profit); 
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        int profit = maxProfit(prices);
        System.out.println(profit);
    }
}
