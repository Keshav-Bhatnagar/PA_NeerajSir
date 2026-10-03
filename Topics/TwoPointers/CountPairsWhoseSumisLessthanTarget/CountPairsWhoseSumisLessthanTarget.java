class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int left = 0;
        int right = nums.size()-1;
        int pair = 0;

        while (left < right) {
            int total = nums.get(left) + nums.get(right);

            if (total < target) {
                pair += (right - left);
                left++;
            } else {
                right--;
            }
        }

        return pair;
    }
}