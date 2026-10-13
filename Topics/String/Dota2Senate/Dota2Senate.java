class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> qr = new LinkedList<>();
        Queue<Integer> qd = new LinkedList<>();
        for (int i = 0; i < senate.length(); i++) {
            if (senate.charAt(i) == 'R') {
                qr.add(i);
            } else {
                qd.add(i);
            }
        }
        while (!qd.isEmpty() && !qr.isEmpty()) {
            int r = qr.poll();
            int d = qd.poll();
            if (r < d)
                qr.add(r+senate.length());
            else {
                qd.add(d+senate.length());
            }
        }
        return (qr.size()>qd.size())?"Radiant":"Dire";
    }
}