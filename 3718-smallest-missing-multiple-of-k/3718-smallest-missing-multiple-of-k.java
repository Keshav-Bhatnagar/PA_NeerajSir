class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer>hs=new HashSet<>();
        for(int e:nums)hs.add(e);
        int sum=k;
        while(hs.contains(sum))sum+=k;
        return sum;

    }
}