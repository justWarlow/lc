class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Queue<int[]> queue = new PriorityQueue<int[]>(new Comparator<int[]>() {
            @Override
            public int compare(int[] q1, int[]q2) {
                return q2[1] - q1[1];
            }
        });
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            queue.offer(new int[]{entry.getKey(), entry.getValue()});
        }
        
        List<Integer> result = new ArrayList<Integer>();
        while (result.size() < k) {
            result.add(queue.poll()[0]);
        }
        return result;
    }
}
