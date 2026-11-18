
class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        ArrayList<int[]> list = new ArrayList<>();

        int[] first = intervals[0];

        for (int i = 1; i < intervals.length; i++) {

            int[] second = intervals[i];

            if (second[0] <= first[1]) {
                first[1] = Math.max(first[1], second[1]);
            } else {
                list.add(first);
                first = second;
            }
        }

        list.add(first);

        return list.toArray(new int[list.size()][]);
    }
}
