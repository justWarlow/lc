class Solution {
    public String reverseVowels(String s) {
        if (s == null || s.length() == 0) return s;
        String vowels = "aeiouAEIOU";
        char[] chars = s.toCharArray();
        for (int i = 0, j = s.length() - 1; i < j; ) {
            if (!vowels.contains(chars[i] + "")) {
                i++;
                continue;
            }
            if (!vowels.contains(chars[j] + "")) {
                j--;
                continue;
            }
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        return new String(chars);
    }
}