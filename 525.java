class Solution {
    public int findMaxLength(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return 0;
        }
        int len = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,0);
        int res = 0;
        int sum = 0;       
        for (int i = 1; i <=len; i++ ) {
            sum = sum + (nums[i-1] == 0 ? -1 : 1);
            if (map.containsKey(sum)) {
                res = Math.max(i - map.get(sum), res);        
            } else {
                map.put(sum, i);
            }  
        }
        return res;
    }
}
