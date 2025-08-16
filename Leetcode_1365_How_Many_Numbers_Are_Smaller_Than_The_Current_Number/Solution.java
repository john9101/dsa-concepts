class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums == null ? 0 : nums.length;

        // 1. Initialize the count array with a maximum of 100 elements
        int[] count = new int[101];

        // 2. Count the number of occurrences of each element in the count array
        for (int num : nums) {
            count[num]++;
        }

        // 3. Initialize the smaller count array with a maximum of 100 elements
        int[] smallerCount = new int[101];

        // 4. Calculate the number of elements less than v
        for (int v = 1; v < 101; v++) {
            smallerCount[v] = smallerCount[v - 1] + count[v - 1];
        }

        // 5. Initialize the result array with a maximum of n elements
        int[] result = new int[n];

        // 6. Reassign to result array based on order of nums array
        for (int i = 0; i < n; i++) {
            result[i] = smallerCount[nums[i]];
        }

        return result;
    }
}