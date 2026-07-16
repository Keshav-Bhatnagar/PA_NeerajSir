class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
           
            int maxCandies = 0;
        for (int c : candies) {
            if (c > maxCandies) {
                maxCandies = c;
            }
        }
        List<Boolean> result = new ArrayList<>();
        for (int c : candies) {
            result.add(c + extraCandies >= maxCandies);
        }


        return result;


    }
}