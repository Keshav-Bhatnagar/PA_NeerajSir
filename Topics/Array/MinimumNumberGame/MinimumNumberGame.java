class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        IO.print(Arrays.toString(nums));
        int count = 0;
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length - 1; i++) {
            if (count % 2 == 0)
                arr[i] = nums[i + 1];
            else
                arr[i] = nums[i - 1];
            count++;
        }
        arr[nums.length-1]=nums[nums.length-2];

        return arr;
    }
}