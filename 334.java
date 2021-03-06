class Solution { 
    public boolean increasingTriplet(int[] nums) {
        if(nums.length < 3) return false;
        int min = nums[0];
        long diff = Integer.MAX_VALUE;
        for(int i =  1;i<nums.length;i++){
            if(nums[i]>min){
                if(nums[i]-min > diff) return true;
                diff = nums[i]-min;
                continue;
            }
            int d = min - nums[i];
            diff+=d;
            min = nums[i];
        }
        return false;
    }
}
