class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int [] ans = new int [2];
        HashMap<Integer,Integer>hs=new HashMap<>();
        for (int e : nums) {
            hs.put(e, hs.getOrDefault(e, 0) + 1);
        }

        int i=0;
        for(int key:hs.keySet()){
            if(hs.get(key)==2){
                ans[i++]=key;
            }
        }
        return ans;
    }
}