class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer>hm= new HashMap<>();
        for(char c: s.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        String ans="";
        List<Character> list = new ArrayList<>(hm.keySet());
        list.sort((a, b) -> hm.get(b) - hm.get(a));
        for(Character c: list){
            while(hm.get(c)>0){
                ans+=c;
                hm.put(c, hm.get(c) - 1);
            }
        }
        return ans;
    }
}