class Solution {
    public int maxProduct(int[] nums) {
        int currMax = nums[0];
        int currMin = nums[0];
        int maxProduct = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int x = nums[i];

            if (x < 0) {
                int temp = currMax;
                currMax = currMin;
                currMin = temp;
            }

            currMax = Math.max(x, currMax * x);
            currMin = Math.min(x, currMin * x);

            maxProduct = Math.max(maxProduct, currMax);
        }

        return maxProduct;
    }
}