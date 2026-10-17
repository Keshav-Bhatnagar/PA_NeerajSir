class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        double sum=Integer.MAX_VALUE;
        for (int i = 0; i < n / 2; i++) {
            int first = nums[i];
            int last = nums[n - i - 1];
            double avg = (first + last) / 2.0;
            sum=Math.min(avg,sum);
        }
        return sum;
    }
}