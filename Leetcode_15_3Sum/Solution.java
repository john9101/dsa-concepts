class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // 1. Sort the array to use the two-pointer technique
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {

            // 2. Skip duplicate first numbers to avoid duplicate triplets
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int l = i + 1, r = nums.length - 1;

            // 3. Move two pointers to find pairs that sum with nums[i] to 0
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[l], nums[r]));

                    // 4. Skip duplicates for left pointer
                    while (l < r && nums[l] == nums[l + 1]) l++;

                    // 5. Skip duplicates for right pointer
                    while (l < r && nums[r] == nums[r - 1]) r--;

                    // 6. Move both pointers after recording the triplet
                    l++;
                    r--;
                }

                // 7. Sum is less than 0 → increase it by moving left pointer
                else if (sum < 0) {
                    l++;
                }

                // 8. Sum is greater than 0 → decrease it by moving right pointer
                else {
                    r--;
                }
            }
        }

        return result;
    }
}