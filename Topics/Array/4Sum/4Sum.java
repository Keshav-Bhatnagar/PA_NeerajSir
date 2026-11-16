class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>>set =new HashSet<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int start=j+1;int end=nums.length-1;
                while(start<end){
                    long sum= (long)nums[start]+nums[end]+nums[i]+nums[j];
                    if(sum==target){
                    set.add(Arrays.asList(nums[start],nums[end],nums[i],nums[j]));
                    start++;
                    end--;
                    }else if(sum<target){
                        start++;
                    }else{
                        end--;
                    }
                 }
            }
        }
        return new ArrayList<>(set);
    }
}