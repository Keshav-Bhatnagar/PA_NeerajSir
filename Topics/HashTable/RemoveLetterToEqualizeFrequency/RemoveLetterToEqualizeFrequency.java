class Solution {
    public boolean equalFrequency(String word) {
        HashMap<Character, Integer> hm = new HashMap<>();

        for (char c : word.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        for (char c : hm.keySet()) {
            hm.put(c, hm.get(c) - 1);
            HashSet<Integer> hs = new HashSet<>();
            for (int freq : hm.values()) {
                if (freq > 0) hs.add(freq);
            }

            if (hs.size() == 1) return true;

            hm.put(c, hm.get(c) + 1);
        }

        return false;
    }
}