class Solution {
    public int[] constructArray(int n, int k) {
        int[] arr = new int[n];
        int i = 0, small = 1, large = n;
        while (i < k) {
            arr[i++] = small++;
            if (i < k) {
                arr[i++] = large--;
            }
        }
        if (k % 2 == 0) { 
            while (i < arr.length) {
                arr[i++] = large--;
            }
        } else { 
            while (i < arr.length) {
                arr[i++] = small++;
            }
        }
        return arr;
    }
}