class Solution {
    public boolean isPerfectSquare(int num) {
        // 1. Initialize low and high values
        long low = 1, high = num;
        while (low <= high) {

            // 2. Calculate mid value and prevent overflow
            long mid = low + (high - low) / 2;
            long sq = mid * mid;

            // 3. If the num equals to the sq, return true. If the num is greater than the sq, increase the low value. If the num is less than the sq, decrease the high value.
            if(num == sq){
                return true;
            }else if(num > sq){
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }

        return false;
    }
}