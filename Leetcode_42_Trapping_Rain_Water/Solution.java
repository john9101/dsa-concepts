class Solution {
    public int trap(int[] height) {
        int l = 0, r = height.length - 1;

        // 1. Track the maximum height on the left and right
        int leftMax = 0, rightMax = 0;
        int result = 0;

        while (l < r) {

            // 2. If the left bar is shorter than the right bar, then proces the left bar
            // Else, processing the right bar
            if (height[l] < height[r]) {
                if (height[l] >= leftMax) {
                    leftMax = height[l];
                } else {
                    result += leftMax - height[l];
                }
                l++;
            } else {
                if (height[r] >= rightMax) {
                    rightMax = height[r];
                } else {
                    result += rightMax - height[r];
                }
                r--;
            }
        }

        return result;
    }
}