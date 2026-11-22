class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        char[] original = p.toCharArray();
        Arrays.sort(original);
        for (int i = 0; i <= s.length() - p.length(); i++) {
            char[] check = s.substring(i, i + p.length()).toCharArray();
            Arrays.sort(check);
            if (Arrays.equals(original, check)) {
                ans.add(i);
            }
        }

        return ans;
    }
}