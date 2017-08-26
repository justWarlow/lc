class Solution {
    public String convertToTitle(int n) {
        StringBuilder ans = new StringBuilder();
        while (n > 0) {
            ans.insert(0, (char)('A' + --n % 26));
            n /= 26;
        }
        return ans.toString();
    }
}