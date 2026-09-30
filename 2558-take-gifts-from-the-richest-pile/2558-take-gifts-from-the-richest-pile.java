class Solution {
    public long pickGifts(int[] gifts, int k) {
        int n = gifts.length;
        PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0 ; i<n ; i++){
            pq.add(gifts[i]);
        }

        while( k > 0 ){
           int max = pq.remove();

           int remain = (int)Math.sqrt(max);
           pq.add(remain);
           k--;
        }
        long sum = 0;
        while(!pq.isEmpty()){
            sum += pq.remove();
        }
        return sum;

        
    }
}