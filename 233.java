class Solution {
    public int countDigitOne(int n) {
        if (n < 1) {
            return 0;
        }
        int count = 0, curr = 0;
        long high = 0, low = 0, factor = 1;
        while (n / factor != 0) {
            low = n - (n / factor) * factor;
            high = n / (factor * 10);
            curr = (int ) (n / factor - high * 10);
            switch(curr) {
                case 0:
                    count += (int) high * factor;
                    break;
                case 1:
                    count += (int) (high * factor + low + 1);
                    break;
                default:
                    count += (int) (high + 1) * factor;
                    break;
            }
            factor *= 10;
        }
        return count;
    }
}