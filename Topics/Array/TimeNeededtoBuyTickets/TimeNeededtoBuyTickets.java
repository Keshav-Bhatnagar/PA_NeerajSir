class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time =0;
        Queue<Integer>q= new LinkedList<>();
        for(int i=0;i<tickets.length;i++){
            q.add(i);
        }
        while(true){
            int person =q.poll();
            tickets[person]--;
            time++;
            if(person==k && tickets[person]==0)return time;
            if(tickets[person]>0)q.add(person);
        }
    }
}