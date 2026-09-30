class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int idx=0;
        int [] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
             if(nums[i]<pivot){
                arr[idx]=nums[i];
                idx++;
            }
        }
        for(int i =0;i<nums.length;i++){
            if(nums[i]==pivot){
                arr[idx]=pivot;
                idx++;
            }
        }
        for(int i =0;i<nums.length;i++){
            if(nums[i]>pivot){
                arr[idx]=nums[i];
                idx++;
            }
        }
        return arr;
    }
}