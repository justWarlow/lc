class Solution {
  
    public boolean isHappy(int n) {
        if (n <= 0) {
            return false;
        }
        HashSet<Integer> set = new HashSet<Integer>();
        while (n !=1 && !set.contains(n)) {
            set.add(n);
            int m = n;
            n = 0;
            while (m != 0) {
                n += (m%10)*(m%10);
                m = m/10;
            }
        }
        return n == 1;
    }
}
