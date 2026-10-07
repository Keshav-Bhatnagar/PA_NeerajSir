class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxi=Integer.MIN_VALUE;
        for(String s : sentences){
            String [] word=s.split(" ");
            maxi=Math.max(word.length,maxi);
        }
        return maxi;
    }
}