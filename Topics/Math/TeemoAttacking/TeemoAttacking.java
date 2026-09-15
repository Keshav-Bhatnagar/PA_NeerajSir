class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int sum=0;
        for(int i=1;i<timeSeries.length;i++){
            sum+=Math.min(timeSeries[i]-timeSeries[i-1],duration);
        }
        sum+=duration;
        return sum;
    }
}