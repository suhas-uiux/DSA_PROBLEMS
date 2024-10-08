// Input: prices = [7,1,5,3,6,4]
// Output: 5
// Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
// Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;  
        int right = 1;  
        int maxProfit = 0;
        
        while (right < prices.length) {
            
            if (prices[left] < prices[right]) {
                int profit = prices[right] - prices[left];
                maxProfit = Math.max(maxProfit, profit);
            } else {
               
                left = right;
            }
            right++;
        }
        
        return maxProfit;
    }
}
