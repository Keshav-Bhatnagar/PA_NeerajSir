class Solution {
    public int maxArea(int[] height) {
        int maxA=Integer.MIN_VALUE;
        int start=0; 
        int end=height.length-1;
        while(start<end){
             int base = end-start;
             int currheight = Math.min(height[start],height[end]);
             int currArea = base*currheight;
             maxA=Math.max(currArea,maxA);
             if(height[start]<height[end])start++;else end--;
        }
        return maxA;
    }
}