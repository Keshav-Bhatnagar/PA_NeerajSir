class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {

        while (k > 0) {

            int min = Integer.MAX_VALUE;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] < min) {
                    min = nums[i];
                }
            }

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == min) {
                    nums[i] = min * multiplier;
                    break;
                }
            }
            k--;
        }
        return nums;
    }
}