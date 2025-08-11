class Solution {
    public int fib(int n) {
        // 1. Determine the terminal step
        if(n < 2){
            return n;
        }

        // 2. Recursive processing with fibonacci expressions
        return fib(n-1) + fib(n-2);
    }
}