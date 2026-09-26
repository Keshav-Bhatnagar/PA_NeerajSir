class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer>arr=new ArrayList<>();
        int count=0;
        for(String word:words){
             if (word.indexOf(x) != -1) {
                arr.add(count);
            }
            count++;
        }
        return arr;
    }
}