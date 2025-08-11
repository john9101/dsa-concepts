class Solution {
    class Solution {
        public boolean isHappy(int n) {
            // 1. Initialize a list to contain the numbers seen
            Set<Integer> seen = new HashSet<>();
            return isHappySupp(n, seen);
        }

        // 2. Compute the sum of quare of digit
        private int digitSum(int n){
            int result = 0;
            while(n > 0){
                int digit = n % 10;
                result += digit * digit;
                n /= 10;
            }
            return result;
        }

        private boolean isHappySupp(int n, Set<Integer> seen){
            // 3. Determine the terminal step
            if(n == 1) return true;
            else if(seen.contains(n)) return false;

            // 4. Add a new number into the seen number list
            seen.add(n);

            // 5. Recursive processing
            return isHappySupp(digitSum(n), seen);
        }
    }
}