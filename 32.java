class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<Integer>();
        int max = 0;
        int cur = 0;
        for (int i = 0; i < s.length();i++) {
            if (s.charAt(i) == '(') {
                st.push(cur);
                cur = 0;
            } else if (s.charAt(i) == ')') {
                if(st.isEmpty()) {
                    cur = 0;
                } else {
                    cur += st.pop() + 2;
                    if(cur > max) {
                        max = cur;
                    }
                }
            }
        }
        return max;
    }
}