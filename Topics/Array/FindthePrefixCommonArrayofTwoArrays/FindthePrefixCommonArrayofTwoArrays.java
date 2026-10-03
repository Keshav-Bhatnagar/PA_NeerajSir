class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashSet<Integer> hsA= new HashSet<>();
        HashSet<Integer> hsB= new HashSet<>();
        int [] ans = new int[A.length];
        for(int i=0;i<A.length;i++){
            hsA.add(A[i]);
            hsB.add(B[i]);
            int count = 0;

            for (int x : hsA) {
                if (hsB.contains(x)) {
                    count++;
                }
            }
            ans[i]=count;
        }
        return ans;
    }
}