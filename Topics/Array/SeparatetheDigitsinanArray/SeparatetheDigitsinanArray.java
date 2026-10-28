class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int e : nums) {
            ArrayList<Integer> arr = new ArrayList<>();
            while (e > 0) {
                arr.add(e % 10);
                e /= 10;
            }
            Collections.reverse(arr);
            ans.addAll(arr);
        }
        int[] res = new int[ans.size()];

        for (int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);
        }

        return res;
    }
}