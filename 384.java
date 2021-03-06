class Solution {
    int[] original;
    int[] shuffled;
    int size;
    Random rand = new Random(); 
    public Solution(int[] nums) {
        original = nums;
        size = nums.length;
        shuffled = new int[size];
        for (int i = 0; i < size; i++) {
            shuffled[i] = original[i];
        }
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return original;
    }
    
    /** Returns a random shuffling of the array. */
    void swap(int[] nums, int x, int y){
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
    
    public int[] shuffle() {
        int count = size;
        while ( count > 0) {
            swap(shuffled, count - 1, rand.nextInt(count--));
        }
        return shuffled;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
