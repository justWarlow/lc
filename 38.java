class Solution {
    public String countAndSay(int n) {
        if (n <= 0) {
            return "";
        }
        String ans = "1";
        for (int i = 1; i < n; i++) {
            String pre = ans;
            ans = "";
            char temp = pre.charAt(0);
            int count = 1;
            for (int j = 1; j < pre.length(); j++) {
                if (pre.charAt(j) != temp) {
                    ans += count + temp;
                    temp = pre.charAt(j);
                    count = 1;
                } else {
                    count++;
                }
            }
            ans += count + temp;
        }
        return ans;
    }
}