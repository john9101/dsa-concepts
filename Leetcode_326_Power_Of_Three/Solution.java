class Solution {
    public boolean isPowerOfThree(int n) {
        // 1. Determine the terminal step
        if(n < 1) return false;
        else if(n == 1) return true;
        else if(n % 3 != 0) return false;

        // 2. Recursive processing
        return isPowerOfThree(n / 3);
    }
}