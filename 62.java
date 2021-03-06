class Solution {
    public int uniquePaths(int m, int n) {
    int[] map = new int[Math.min(m, n)];
    map[0] =1;
    int pre = 0;
    for (int i = 0; i < Math.max(m, n); i++) {
        pre = 0;
        for (int j = 0; j < Math.min(m, n); j++) {
            map[j] += pre;
            pre = map[j];
        }
    }
    return map[Math.min(m, n) - 1];    
    }
}
