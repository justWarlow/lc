class Solution {
    public int romanToInt(String s) {
        int res = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int val;
            if (s.charAt(i) == 'I') {
                val = 1;
            }
            else if (s.charAt(i) == 'V') {
                val = 5;
            }
            else if (s.charAt(i) == 'X') {
                val = 10;
            }
            else if (s.charAt(i) == 'L') {
                val = 50;
            }
            else if (s.charAt(i) == 'C') {
                val = 100;
            }
            else if (s.charAt(i) == 'D') {
                val = 500;
            }
            else {
                val = 1000;
            }
            if (i == s.length() - 1) {
                res += val;
            }
            else if (val == 1 && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X')) {
                res -= val;
            }
            else if (val == 10 && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')) {
                res -= val;
            }
            else if (val == 100 && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')) {
                res -= val;
            }
            else {
                res += val;
            }
        }
        return res;
    }
}