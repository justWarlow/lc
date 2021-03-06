class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2); 
        int i = 0, j = 0, counter = 0;
        int iL = nums1.length;
        int jL = nums2.length;
        int[] res = new int [iL < jL ? iL : jL];        
        while (i < iL && j < jL) {
            if (nums1[i] == nums2[j]) {
                results[counter++] = nums1[i];
                i++;
                j++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                i++;
            }
        }
        return Arrays.copyOf(results, counter);
    }
}
