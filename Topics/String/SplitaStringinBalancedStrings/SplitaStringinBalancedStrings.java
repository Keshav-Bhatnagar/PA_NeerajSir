class Solution {
    public int balancedStringSplit(String s) {
        HashMap<Character,Integer>hm=new HashMap<>();
        int count=0;
        hm.put('L',0);
        hm.put('R',0);
        for(char c:s.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
            if(hm.get('L').equals(hm.get('R'))){
                count++;
            }
        }
        return count;
    }
}