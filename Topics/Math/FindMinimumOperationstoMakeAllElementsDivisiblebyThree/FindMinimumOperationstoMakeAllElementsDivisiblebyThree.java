class Solution {
    public int minimumOperations(int[] nums) {
        int cnt =0;
        for(int e:nums){
            int rem=e%3;
            cnt+=Math.min(rem,3-rem);
        }
        return cnt;
    }
}