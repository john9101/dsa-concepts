class Solution {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int area = 0;
        while (l < r) {

            // 1. The container height is limited by the shorter line
            int h = Math.min(height[l], height[r]);

            // 2. The container width is the distance between two pointers
            int w = r - l;

            // 3. Calculate area and update maximum if larger
            area = Math.max(w * h, area);

            // 4. Move the pointer at the shorter line inward
            // Because moving the taller line cannot increase height
            // But moving the shorter one may find a taller line to maximize area
            while (l < r && height[l] <= h) l++;
            while (l < r && height[r] <= h) r--;
        }

        return area;
    }
}