import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> arr = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {           // 1 * * * * 1
                    arr.add(1);
                } 
                else {
                    List<Integer> prevRow = ans.get(i - 1);
                    int value = prevRow.get(j - 1) + prevRow.get(j);
                    arr.add(value);
                }
            }
            ans.add(arr);
        }
        return ans;
    }
}