class Solution {
    public int maxVowels(String s, int k) {
        String vowels = "aeiou";
        int count = 0;
        for (int i = 0; i < k; i++) {
            if (vowels.contains(String.valueOf(s.charAt(i)))) {
                count++;
            }
        }
        int maxCount = count;
        for (int i = k; i < s.length(); i++) {
            String  c = String.valueOf(s.charAt(i));
            if (vowels.contains(c)) {
                count++;
            }
            if (vowels.contains(String.valueOf(s.charAt(i-k)))) {
                count--;
            }
            maxCount = Math.max(maxCount, count);

        }
        return maxCount;
    }
}