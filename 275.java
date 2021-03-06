class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int low = 0, high = n;
        while(low < high) {
        int mid = (low + high + 1) / 2;
        if (citations[n - mid] < mid) {
            high = mid - 1;
        } else {
            low = mid;
        }
    }
    return low;
    }
}
