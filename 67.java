class Solution {
    public String addBinary(String a, String b) {
        int c = 0;
        StringBuilder ans = new StringBuilder();
        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0;) {
            if(i >= 0) {
                c += a.charAt(i--) - '0';
            }
            if(j >= 0) {
                c += b.charAt(j--) - '0';
            }
            ans.insert(0, (char)((c % 2) + '0'));
            c /= 2;
        }
        if(c == 1) {
            ans.insert(0, "1");
        }
        return ans.toString();
    }
}