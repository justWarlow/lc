class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] all = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;
        while (i < nums1.length && j < nums2.length) {
            if(nums1[i] <= nums2[j]){
                all[k++] = nums1[i++];
            }
            else {
                all[k++] = nums2[j++];
            }
        }
        while (i < nums1.length) {
            all[k++] = nums1[i++];
        }
        while (j<nums2.length) {
            all[k++] = nums2[j++];
        }
        if(all.length % 2 == 1) {
            return (double) all[all.length / 2];
        }
        else{
            return (double) (all[all.length / 2 - 1] + all[all.length / 2 ]) / 2;
        }
    }
}