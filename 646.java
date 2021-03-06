class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (int[] a, int[]b) -> a[1] - b[1]);
        int res = 1;
        int last = pairs[0][1];
        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > last) {
                res++;
                last = pairs[i][1];
            }
        }
        return res;
    }    
}
