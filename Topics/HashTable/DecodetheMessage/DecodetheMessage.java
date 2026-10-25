class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character, Character> hm = new HashMap<>();
        char current = 'a';
        for (char c : key.toCharArray()) {
            if (c != ' ' && !hm.containsKey(c)) {
                hm.put(c, current);
                current++;
            }
        }
        StringBuilder ans = new StringBuilder();
        for (char c : message.toCharArray()) {
            if (c == ' ') {
                ans.append(' ');
            } else {
                ans.append(hm.get(c));
            }
        }
        return ans.toString();
    }
}