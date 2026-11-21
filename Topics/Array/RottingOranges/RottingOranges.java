class Solution {
    public int orangesRotting(int[][] grid) {
        if(grid == null || grid.length == 0)
            return -1;
        int m=grid.length;
        int n = grid[0].length;
        int [][] time = new int[m][n];
        for(int i=0;i<m;i++)Arrays.fill(time[i],Integer.MAX_VALUE);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2)dfs(grid,i,j,time,0);
            }
        }
        int timerequired=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    if(time[i][j]==Integer.MAX_VALUE)return -1;
                    timerequired=Math.max(timerequired,time[i][j]);
                }
            }
        }
        return timerequired;
    }
    public void dfs(int [][]grid,int i,int j,int[][]time,int currtime){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || currtime>=time[i][j] || grid[i][j]==0  ) return ;

        time[i][j] = currtime;

        dfs(grid,i+1,j,time,currtime+1);
        dfs(grid,i-1,j,time,currtime+1);
        dfs(grid,i,j+1,time,currtime+1);
        dfs(grid,i,j-1,time,currtime+1);
    }
}