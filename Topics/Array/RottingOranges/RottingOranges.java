class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int mintime = 0;
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    q.add(new int[] { i, j });
                }
                if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }
        return bfs(grid, q, fresh, mintime);
    }

    int bfs(int[][] grid, Queue<int[]> q, int fresh, int mintime) {
        int m = grid.length;
        int n = grid[0].length;
        while (!q.isEmpty() && fresh > 0) {
            int size = q.size();
            for (int k = 0; k < size; k++) {
                int[] curr = q.poll();
                int i = curr[0];
                int j = curr[1];
                if (i + 1 < m && grid[i + 1][j] == 1) {
                    grid[i + 1][j] = 2;
                    fresh--;
                    q.add(new int[] { i + 1, j });
                }
                if (i - 1 >= 0 && grid[i - 1][j] == 1) {
                    grid[i - 1][j] = 2;
                    fresh--;
                    q.add(new int[] { i - 1, j });
                }
                if (j + 1 < n && grid[i][j + 1] == 1) {
                    grid[i][j + 1] = 2;
                    fresh--;
                    q.add(new int[] { i, j + 1 });
                }
                if (j - 1 >= 0 && grid[i][j - 1] == 1) {
                    grid[i][j - 1] = 2;
                    fresh--;
                    q.add(new int[] { i, j - 1 });
                }
            }
            mintime++;
        }

        return fresh == 0 ? mintime : -1;
    }
}