class Solution {
    public boolean isPowerOfThree(int n) {
        // 1. Determine the terminal step
        if(n < 1) return false;
        else if(n == 1) return true;
        else if(n % 3 != 0) return false;

        // 2. Recursively check if n is a power of three
        return isPowerOfThree(n / 3);
    }
}