class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> hs = new HashSet<>();
        for (char c : allowed.toCharArray()) {
            hs.add(c);
        }
        int accepted = 0;
        for (String word : words) {
            boolean valid = true;
            for (char c : word.toCharArray()) {
                if (!hs.contains(c)) {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                accepted++;
            }
        }
        return accepted;
    }
}