class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer>permutations=new ArrayList<>();
        int[]visited=new int [nums.length];
        helper(ans,permutations,nums,visited);
        return ans;
    }
    public void helper(List<List<Integer>>ans,List<Integer>permutations,int[]nums,int[]visited){
        if (permutations.size() == nums.length) {
            ans.add(new ArrayList<>(permutations));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(visited[i]==0){
                visited[i]=1;
                permutations.add(nums[i]);
                helper(ans,permutations,nums,visited);
                permutations.remove(permutations.size()-1);
                visited[i]=0;
            }
        }
    }
}