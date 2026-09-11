class Solution {
    public int[] findEvenNumbers(int[] digits) {

        int[] freq = new int[10];

        for (int d : digits) {
            freq[d]++;
        }

        List<Integer> result = new ArrayList<>();

        solve(freq, 0, 0, result);

        int[] ans = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }

        return ans;
    }

    void solve(int[] freq, int pos, int num, List<Integer> result) {

        if (pos == 3) {
            result.add(num);
            return;
        }

        for (int d = 0; d <= 9; d++) {

            if (freq[d] == 0) continue;

            if (pos == 0 && d == 0) continue;

            if (pos == 2 && d % 2 != 0) continue;

            // TAKE
            freq[d]--;

            solve(freq, pos + 1, num * 10 + d, result);

            // UNTAKE / BACKTRACK
            freq[d]++;
        }
    }
}