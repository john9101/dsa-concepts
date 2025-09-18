class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // 1. Initialize two pointers
        int l = 0, r = numbers.length - 1;

        while(l < r){

            // 2. Check if sum matches the target
            if(numbers[l] + numbers[r] == target){
                return new int[]{l + 1, r + 1};
            }

            // 3. If sum is too large, move right pointer leftward
            else if(numbers[l] + numbers[r] > target){
                r--;
            }

            // 4. If sum is too small, move left pointer rightward
            else{
                l++;
            }
        }

        return new int[]{-1, -1};
    }
}