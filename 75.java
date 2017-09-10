class Solution {
    public void sortColors(int[] nums) {
        if (nums.length == 0 || nums == null) {
            return;
        }
        int ptr1 = 0;
        int ptr2 = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (ptr2 + 1 == i) {
        		break;
        	}
            if (nums[i] == 0) {
                int temp = nums[i];
                nums[i] = nums[ptr1];
                nums[ptr1] = temp;
                ptr1++;
            } else if (nums[i] == 2) {
                int temp = nums[i];
                nums[i] = nums[ptr2];
                nums[ptr2]=temp;
                ptr2--;
                i--;
            }
        } 
    }
}
