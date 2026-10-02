class Solution {
    public int countPartitions(int[] nums) {

        int sum = 0;

        for (int e : nums)
            sum += e;

        return sum % 2 == 0 ? nums.length - 1 : 0;
    }
}