class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        String reversed = sb.substring(0, k);

        String remain = sb.substring(k);
         return new StringBuilder(reversed).reverse().toString() + remain;

    }
}