class Solution {
    public String reverseString(String s) {
        StringBuilder ans = new StringBuilder(s);
        for (int i = 0, j = s.length() - 1; j - i > 0; i++, j--) {
            char temp = s.charAt(i);
            ans.setCharAt(i, s.charAt(j));
            ans.setCharAt(j, temp);
        }
        return ans.toString();
    }
}