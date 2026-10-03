class Solution {

    List<List<Integer>> result = new ArrayList<>();

    void solve(int[] candidates, int target, int i, List<Integer> current) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        if (i == candidates.length) {
            return;
        }
        if (candidates[i] <= target) {

            current.add(candidates[i]);
            solve(candidates, target - candidates[i], i, current);
            current.remove(current.size() - 1);
        }
        solve(candidates, target, i + 1, current);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<Integer> current = new ArrayList<>();

        solve(candidates, target, 0, current);

        return result;
    }
}