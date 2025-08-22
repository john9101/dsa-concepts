class Solution {
    public int arrangeCoins(int n) {
        // 1. Initialize low, high, and result values
        long low = 1, high = n, result = 0;
        while(low <= high){

            // 2. Calculate mid value and prevent overflow
            long mid = low + (high - low) / 2;

            // 3. Ìf the total coins needed for mid rows is less than or equal to the n given coins, 
            // update result with mid value and increase the low value. 
            // Else, decrease the high value.
            if (mid * (mid + 1) / 2 <= n) {
                result = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return (int) result;
    }
}