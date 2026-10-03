class Solution {
    int count = 0;

    public int countMaxOrSubsets(int[] nums) {
        int maxOR = 0;
        // Find Max Or

        // property says max or is or of all elements
        for (int e : nums) {
            maxOR |= e;
        }
        backtrack(0, nums, 0, maxOR);
        return count;
    }

    private void backtrack(int idx, int[] nums, int currentOR, int maxOR) {
        if (idx == nums.length) {
            if (currentOR == maxOR) {
                count++;
            }
            return;
        }
        backtrack(idx + 1, nums, currentOR | nums[idx], maxOR);
        backtrack(idx + 1, nums, currentOR, maxOR);
    }
}