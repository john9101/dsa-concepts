class Solution {
    public int search(int[] nums, int target) {
        // 1. Initialize low and high indexs
        int low = 0, high = nums.length - 1;

        while(low <= high){

            // 2. Calculate mid index and prevent overflow
            int mid = low + (high - low) / 2;

            // 3. If the target equals to element value at mid index, return mid index.
            // If the target is greater than element value at mid index, increase the low value.
            // Else, decrease the high value.
            if(target == nums[mid]){
                return mid;
            }else if(target > nums[mid]){
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }

        return -1;
    }
}