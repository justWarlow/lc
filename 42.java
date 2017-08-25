class Solution {
    public int trap(int[] height) {
        int lo = 0, hi = height.length - 1;
        int ans = 0, level = 0;
        while (lo < hi) {
            if (height[lo] > height[hi]) {
                level = height[hi] > level ? height[hi] : level;
                ans += Math.max(level - height[hi], 0);
                hi--;
            } else {
                level = height[lo] > level ? height[lo] : level;
                ans += Math.max(level - height[lo], 0);
                lo++;
            }
        }
        return ans;
    }
}