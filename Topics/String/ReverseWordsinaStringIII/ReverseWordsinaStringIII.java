class Solution {
    public String reverseWords(String s) {
        StringBuilder sb= new StringBuilder();
        String [] words = s.split(" ");
        for (String ss : words) {
             sb.append(new StringBuilder(ss).reverse()).append(" ");
        }
    return sb.toString().trim();
    }
}