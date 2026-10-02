class Solution {
    public int maxFreqSum(String s) {
        
        int vowlF = 0;
        int constF = 0;

        HashMap<Character, Integer> hs = new HashMap<>();

        for (char ch : s.toCharArray()) {
            hs.put(ch, hs.getOrDefault(ch, 0) + 1);
        }

        for (char key : hs.keySet()) {
            
            if (key == 'a' || key == 'e' || key == 'i' || 
                key == 'o' || key == 'u') {
                
                vowlF = Math.max(vowlF, hs.get(key));
                
            } else {
                constF = Math.max(constF, hs.get(key));
            }
        }

        return vowlF + constF;
    }
}