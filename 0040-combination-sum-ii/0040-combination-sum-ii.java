class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        solve(candidates, target, 0, new ArrayList<>());
        return ans;
    }

    void solve(int[] arr, int target, int start, List<Integer> path) {
        if (target == 0) {
            ans.add(new ArrayList<>(path));
            return;
        }

        for (int i = start; i < arr.length; i++) {
            if (arr[i] > target)
                break;
            if (i > start && arr[i] == arr[i - 1])
                continue;

            path.add(arr[i]);                 // choose
            solve(arr, target - arr[i], i + 1, path);  // explore
            path.remove(path.size() - 1);    // undo
        }
    }
}