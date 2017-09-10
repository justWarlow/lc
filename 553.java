class Solution {
    public String optimalDivision(int[] nums) {
         StringBuffer res = new StringBuffer();
        if (nums == null || nums.length == 0) {
            return new String();
        }
        if (nums.length == 1) {
            res.append(nums[0]);
            return res.toString();
        }
        else if (nums.length == 2) {
            res.append(nums[0]);
            res.append("/");
            res.append(nums[1]);
            return res.toString();
        }
        else{
            res.append(nums[0]);
            res.append("/");
            res.append("(");
            for (int i = 1; i < nums.length; i++) {
                res.append(nums[i]);
                res.append("/");
            }
            res.setLength(res.length()-1);
            res.append(")");
            return res.toString();
        }   
    }
}
