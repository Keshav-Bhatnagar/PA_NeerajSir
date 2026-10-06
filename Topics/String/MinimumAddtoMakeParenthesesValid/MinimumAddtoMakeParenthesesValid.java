class Solution {
    public int minAddToMakeValid(String s) {
        int open = 0, close = 0;
        for (var c : s.toCharArray()) {
            if (c == '(') {
                open++;
            } else {
                if (open > 0)
                    open--;
                else
                    close++;
            }
        }
        return open + close;
    }
}