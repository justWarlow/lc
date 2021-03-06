class Solution {
    public boolean isAnagram(String s, String t) {
        if (s == null && t == null) {
            return true;
        }
        if (s == null || t == null) {
            return false;
        }
        if (s.length() != t.length()) {
            return false;
        }
        int[] ct= new int[26];      
        for (int i = 0; i < s.length(); i++) {
            ct[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            ct[t.charAt(i) - 'a']--;
            if (ct[t.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
