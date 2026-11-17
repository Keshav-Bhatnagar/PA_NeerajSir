class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length<2)return nums.length;
        Arrays.sort(nums);
        int maxcount=0;
        int count=1;        
        for(int end=0;end<nums.length-1;end++){
            if(nums[end]==nums[end+1]){}
            else if(nums[end+1]-nums[end]==1){count+=1;}
            else count=1;
            maxcount=Math.max(count,maxcount);
        }
        return maxcount;
    }
}