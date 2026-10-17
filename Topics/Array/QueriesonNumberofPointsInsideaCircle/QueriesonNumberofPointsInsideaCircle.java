class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int [] nums= new int[queries.length];
        int count;
        for(int i=0;i<queries.length;i++){
            count=0;
            for(int j=0;j<points.length;j++){
                int x = queries[i][0]-points[j][0];
                int y = queries[i][1]-points[j][1];
                int r = queries[i][2];
                if((x*x)+(y*y)<=r*r)count++;
            }
            nums[i]=count;
        }
        return nums;
    }
}