class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int totalCount=0;
        for(int e:nums){
            int count=0;
            while(e>0){
                int num = e%10;
                if(num==digit){
                    count++;
                }
                e/=10;
            }
            totalCount+=count;
        }
        return totalCount;
    }
}