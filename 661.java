class Solution {
    public int[][] imageSmoother(int[][] M) {
        int[][] res = new int[M.length][M[0].length];
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                int count = 0, sum = 0;
                if (i - 1 >= 0 && i - 1 < M.length && j - 1 >=0 && j - 1 < M[0].length) {
                    count += 1;
                    sum += M[i - 1][j - 1]; // cell0
                }
                if (i - 1 >= 0 && i - 1 < M.length) {
                    count += 1;
                    sum += M[i - 1][j]; // cell1
                }
                if (i - 1 >= 0 && i - 1 < M.length && j + 1 >= 0 && j + 1 < M[0].length) {
                    count += 1;
                    sum += M[i - 1][j + 1]; // cell2
                }
                if (j - 1 >= 0 && j - 1 < M[0].length) {
                    count += 1;
                    sum += M[i][j - 1];
                }
                if (j + 1 >= 0 && j + 1 < M[0].length) {
                    count += 1;
                    sum += M[i][j + 1];
                }
                if (i + 1 >= 0 && i + 1 < M.length && j - 1 >=0 && j - 1 < M[0].length) {
                    count += 1;
                    sum += M[i + 1][j - 1];
                }
                if (i + 1 >= 0 && i + 1 < M.length) {
                    count += 1;
                    sum += M[i + 1][j];
                }
                if (i + 1 >= 0 && i + 1 < M.length && j + 1 >= 0 && j + 1 < M[0].length) {
                    count += 1;
                    sum += M[i + 1][j + 1];
                }
                sum += M[i][j];
                count += 1;
                res[i][j] = sum / count;
            }
        }
        return res;
    }
}