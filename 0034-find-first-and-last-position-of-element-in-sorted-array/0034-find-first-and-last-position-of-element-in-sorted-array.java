class Solution {
    public int FirstOccurence(int[] nums, int n, int target) {
        int high = n - 1;
        int ans = n;
        int low = 0;

        while (low <= high) {
            int mid = low + ( high-low) / 2;
            if (nums[mid] >= target ) {
                ans = mid;
                high =  mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public int LastOccurence(int[] nums, int n, int target) {
        int low = 0;
        int high = n - 1;
        int ans = n;

        while (low <= high) {
           int mid = low + ( high-low) / 2;
            if (nums[mid] > target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int firstOccurence=FirstOccurence(nums,n,target);
        int lastOccurence=LastOccurence(nums,n,target);

        if (firstOccurence == n || nums[firstOccurence] != target) {
            return new int[] {-1, -1};
        }

        return new int[] {firstOccurence, lastOccurence - 1};
    }
}