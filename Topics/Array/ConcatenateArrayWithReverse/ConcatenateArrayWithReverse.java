class Solution {
    public int[] concatWithReverse(int[] nums) {
        int [] result = new int [2*nums.length];
        for(int i =0;i<nums.length;i++){
            result[i]=nums[i];
            result[result.length-i-1]=nums[i];
        }
        return result;
    }
}