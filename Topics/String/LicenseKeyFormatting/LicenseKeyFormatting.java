class Solution {
    public String licenseKeyFormatting(String s, int k) {

        StringBuilder str = new StringBuilder();

        // Remove dashes and convert to uppercase
        for (char ch : s.toCharArray()) {
            if (ch != '-') {
                str.append(Character.toUpperCase(ch));
            }
        }

        int first = str.length() % k;

        StringBuilder ans = new StringBuilder();

        // First group
        if (first > 0) {
            ans.append(str.substring(0, first));
        }

        // Remaining groups
        for (int i = first; i < str.length(); i += k) {

            if (ans.length() > 0) {
                ans.append('-');
            }

            ans.append(str.substring(i, Math.min(i + k, str.length())));
        }

        return ans.toString();
    }
}