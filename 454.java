class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> map1 = new HashMap<Integer , Integer>();
        Map<Integer, Integer> map2 = new HashMap<Integer , Integer>();
        for (int i = 0; i<A.length; i++) {
            for (int j = 0; j<A.length; j++) {
              map1.put(A[i] + B[j], map1.getOrDefault(A[i] + B[j], 0) + 1);
              map2.put(C[i] + D[j], map2.getOrDefault(C[i] + D[j], 0) + 1);
              }
          }
	        int res=0;
	        for (int i : map1.keySet()) {
            res += map1.get(i) * map2.getOrDefault(-i, 0);
          }
	      return res;        
    }
}
