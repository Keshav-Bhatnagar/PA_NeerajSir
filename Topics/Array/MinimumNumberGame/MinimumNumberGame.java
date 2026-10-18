class Solution {
    public int[] numberGame(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.add(num);
        }
        int i = 0;
        while (!pq.isEmpty()) {
            int y = pq.poll();
            int x = pq.poll();
            nums[i++] = x;
            nums[i++] = y;
        }
        return nums;
    }
}