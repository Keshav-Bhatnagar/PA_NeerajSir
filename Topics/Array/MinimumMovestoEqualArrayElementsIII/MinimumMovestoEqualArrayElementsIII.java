class Solution {
    public int minMoves(int[] nums) {
        int maxi=nums[0];
        for(int e:nums){
            maxi=Math.max(e,maxi);
        }
        int count=0;
        for(int e:nums){
            count+= maxi-e;
        }
        return count;
    }
}