class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hs = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            hs.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int find = target - nums[i];

            if (hs.containsKey(find) && hs.get(find) != i) {
                return new int[]{i, hs.get(find)};
            }
        }

        return new int[]{};
    }
}