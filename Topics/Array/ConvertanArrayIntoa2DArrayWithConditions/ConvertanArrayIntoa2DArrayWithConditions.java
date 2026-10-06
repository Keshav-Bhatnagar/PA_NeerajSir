class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        List<List<Integer>> res = new ArrayList<>();
        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        while (!hm.isEmpty()) {
            List<Integer> row = new ArrayList<>();
            for (var i : new ArrayList<>(hm.keySet())) {
                row.add(i);
                hm.put(i, hm.get(i) - 1);
                if (hm.get(i) == 0) {
                   hm.remove(i);
               }
           }
            res.add(row);
        }
        return res;
    }
}