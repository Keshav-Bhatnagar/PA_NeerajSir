class Solution {
    List<String> result = new ArrayList<>();

    public String getHappyString(int n, int k) {
        backtrack(n, k, new StringBuilder(), '\0');
        if (result.size() < k)
            return "";
        Collections.sort(result);

        return result.get(k - 1);
    }

    void backtrack(int n, int k, StringBuilder str, char prev) {
        if (str.length() == n) {
            result.add(str.toString());
            return;
        }
        for (char ch = 'a'; ch <= 'c'; ch++) {
            if (ch == prev)
                continue;
            str.append(ch);
            backtrack(n, k, str, ch);
            str.deleteCharAt(str.length() - 1);
        }
    }
}