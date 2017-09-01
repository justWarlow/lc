class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int len = gas.length;
        int start = 0;
        while (start < len) {
            if (gas[start] - cost[start] < 0) {
                start += 1;
            } else {
                int sum = 0; 
                int i = start; 
                while (i < start + len) {
                    int pos = i % len; 
                    sum += gas[pos] - cost[pos];
                    if (sum < 0) {
                        start = i + 1;
                        break;
                    } else {
                        if ((i + 1) % len == start) { 
                            return start;
                        }
                        i += 1;
                    }
                }
            }
        }
        return -1;
    }
}