class Solution {
    public boolean containsDuplicate(int[] nums) {
        // 1. Initialize a set of seen numbers
        Set<Integer> seen = new HashSet<>();

        // 2. Loop through the elements in the nums array, if any element already exists in the seen set then return true
        for(int num : nums){
            if(!seen.add(num)) return true;
        }

        return false;
    }
}