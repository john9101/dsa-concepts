class Solution {
    public int maxProfit(int[] prices) {
        // 1. Initialize the index on the buy day, the index on the sell day, and maximum profit
        int bIndex = 0, sIndex = 1, maxProfit = 0;

        // 2. Loop
        while(sIndex < prices.length){

            // 3. Check if the price on the sale day is greater than price of buy day, then update new maximum profit
            if(prices[sIndex] > prices[bIndex]){
                maxProfit = Math.max(maxProfit, prices[sIndex] - prices[bIndex]);
            } else {

                // 4. Update index of buy day with current index of sell day if the above condition is not met
                bIndex = sIndex;
            }

            sIndex++;
        }

        return maxProfit;
    }
}