class Solution {
    public long maxAlternatingSum(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Math.abs(nums[i]);
        }
        // System.out.print(Arrays.toString(nums));
        Arrays.sort(nums);
        long sum = 0;
        int n = nums.length / 2;
        for (int i = 0; i < n; i++) {
            sum += 1L * (nums[n + i] * nums[n + i]);
            sum -= 1L * (nums[i] * nums[i]);
            // System.out.print(nums[i] + " " + nums[n + i] + " " + sum);
        }
        if (nums.length % 2 != 0) {
            sum += 1L * nums[nums.length - 1] * nums[nums.length - 1];
        }
        return sum;
    }
}