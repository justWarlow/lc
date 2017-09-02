class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        int k = -1, i;
        int[] pi = prefixMachine(needle);
        for (i = 0; i < haystack.length(); i++) {
            while (k > -1 && needle.charAt(k + 1) != haystack.charAt(i)) {
                k = pi[k];
            }
            if (needle.charAt(k + 1) == haystack.charAt(i)) {
                k++;
            }
            if (k == needle.length() - 1)
                return i - needle.length() + 1;
        }
        return -1;
    }

    private int[] prefixMachine(String needle) {
        int[] pi = new int[needle.length()];
        pi[0] = -1;
        int k = -1;
        for (int i = 1; i < needle.length(); i++) {
            while (k > -1 && needle.charAt(k + 1) != needle.charAt(i)) {
                k = pi[k];
            }
            if (needle.charAt(k + 1) == needle.charAt(i)) {
                k++;
            }
            pi[i] = k;
        }
        return pi;
    }
}