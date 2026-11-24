class Solution {
    public boolean exist(char[][] board, String word) {
        int[][] visited = new int[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (helper(board, word, visited, i, j, 0)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public boolean helper(char[][] board, String word, int[][] visited,
            int row, int col, int start) {

        if (start == word.length())
            return true;

        if (row < 0 || col < 0 ||
                row >= board.length || col >= board[0].length) {
            return false;
        }

        if (visited[row][col] == 1)
            return false;

        if (board[row][col] != word.charAt(start))
            return false;

        visited[row][col] = 1;

        boolean found = helper(board, word, visited, row + 1, col, start + 1) ||
                helper(board, word, visited, row - 1, col, start + 1) ||
                helper(board, word, visited, row, col + 1, start + 1) ||
                helper(board, word, visited, row, col - 1, start + 1);

        visited[row][col] = 0;

        return found;
    }

}