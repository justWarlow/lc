class Solution {
    private List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        addSubset(nums, 0, new ArrayList<Integer>());
        return res;
    }

    private void addSubset(int[] nums, int i, List<Integer> b) {
        res.add(b);
        for (int j = i; j < nums.length; j++) {
            List<Integer> c = new ArrayList<>(b);
            if (j == i || (j > i && nums[j] != nums[j - 1])) {
                c.add(nums[j]);
                addSubset(nums, j + 1, c);
            }
        }
    }
}