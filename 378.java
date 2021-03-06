class Solution {
    public int kthSmallest(int[][] matrix, int k) {    
        PriorityQueue<int[]> queue = new PriorityQueue<int[]> (k, new Comparator<int []>(){
             public int compare(int[] a, int[] b){
            	 return  -matrix[a[0]][a[1]] + matrix[b[0]][b[1]];             
             }
        });   
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int[] cur = {i,j};
                if (k > queue.size()) {
                    queue.offer(cur);
                }
                else {
                    int[] top = queue.peek();
                    if (matrix[top[0]][top[1]] >= matrix[cur[0]][cur[1]]){
                        queue.poll();
                        queue.offer(cur);
                    }
                }
            }
        }              
        int[] last = queue.poll();   
        return matrix[last[0]][last[1]];
    }
}
