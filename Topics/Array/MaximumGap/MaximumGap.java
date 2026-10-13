class Solution {
    public int maximumGap(int[] nums) {
        int max_diff=Integer.MIN_VALUE;
        Arrays.sort(nums);
        if(nums.length<2)return 0;
        for(int i=0;i<nums.length-1;i++){
            max_diff = Math.max(max_diff,Math.abs(nums[i+1]-nums[i]));
        }
        return max_diff;
    }
}