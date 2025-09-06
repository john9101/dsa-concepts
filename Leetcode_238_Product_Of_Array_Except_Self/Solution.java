class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        // 1. Initialize the first element of answer as 1 (no prefix product for index 0)
        answer[0] = 1;

        // 2. Build prefix products: answer[i] = product of all elements to the left of i
        for(int i = 1; i < n; i++){
            answer[i] = nums[i - 1] * answer[i - 1];
        }

        // 3. Initialize suffix product with the last element
        int suffix = nums[n - 1];

        // 4. Traverse from right to left: multiply prefix product with suffix product and update suffix product along the way
        for(int i = n - 2; i >= 0; i--){
            answer[i] *= suffix;
            suffix *= nums[i];
        }

        return answer;
    }
}