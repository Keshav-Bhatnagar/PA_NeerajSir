class Solution {
    public int pivotIndex(int[] nums) {
        int total=0;
        for(int num:nums){
            total+=num;
        }
        int left=0;   //0
        int right=0;  //0
        for(int i=0;i<nums.length;i++){
            right=total-left-nums[i];
            if(left==right)return i;
            left+=nums[i];
        }
    return -1;
    }
}