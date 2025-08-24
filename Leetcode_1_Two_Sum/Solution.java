class Solution {
    public int[] twoSum(int[] nums, int target) {
        // 1. Initialize a map with the key being the element value in the nums array and the element index in the nums array
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            // 2. Compute the complement from the target and the element value at index i
            int complement = target - nums[i];

            // 3. If the result of complement exists in the map, return the result array
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}