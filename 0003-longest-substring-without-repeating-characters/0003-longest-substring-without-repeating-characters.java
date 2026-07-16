class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int l =0;
        int r =0;
        HashSet<Character>st = new HashSet<>();
        int res=0;
        while(r<n){
            if(!st.contains(s.charAt(r))){
                st.add(s.charAt(r));
                r++;
            }else{
                st.remove(s.charAt(l));
                l++;
            }
            res=Math.max(res,r-l);
        }
        return res;
    }
}