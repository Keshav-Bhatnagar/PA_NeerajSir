class Solution {
    public int reverseDegree(String s) {
       int sum=0;
       int i=1;
        for(char c :s.toCharArray()){
            c=Character.toLowerCase(c);

            sum+= (26-((int)c - 'a'))*i;
            i++;

        }
        return sum;
    }
}