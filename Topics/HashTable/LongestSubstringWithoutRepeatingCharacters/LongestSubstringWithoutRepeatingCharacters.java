class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>hs = new HashSet<>();
        int start=0;
        int maxel=0;
        for(int end=0;end<s.length();end++){
            while (hs.contains(s.charAt(end))) {
                hs.remove(s.charAt(start));
                start++;
            }

            hs.add(s.charAt(end));
            maxel= Math.max(maxel,hs.size());
        }
        return maxel;
    }
}