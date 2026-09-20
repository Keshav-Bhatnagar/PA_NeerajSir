class Solution {
    public List<List<Integer>> shiftGrid(int[][] arr, int k) {
        int m = arr.length;
        int n = arr[0].length;
        int totalGrid = m * n;

        k %= totalGrid;

        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(0);
            }
            ans.add(row);
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int oldIndex = i * n + j;
                int newIndex = (oldIndex + k) % totalGrid;
                int newRow = newIndex / n;
                int newCol = newIndex % n;

                ans.get(newRow).set(newCol, arr[i][j]);
            }
        }
        return ans;
    }
}