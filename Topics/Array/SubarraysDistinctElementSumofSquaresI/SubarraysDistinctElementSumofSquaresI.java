class Solution {
    public int sumCounts(List<Integer> nums) {
        int ans=0;
        for(int i=0;i<nums.size();i++){
            int sum=0;
            HashSet<Integer>hs = new HashSet<>();
            for(int j=i;j<nums.size();j++){
                int numb = nums.get(j);
                hs.add(numb);
                sum+=hs.size()*hs.size();
            }
            ans+=sum;
        }
        return ans;
    }
}