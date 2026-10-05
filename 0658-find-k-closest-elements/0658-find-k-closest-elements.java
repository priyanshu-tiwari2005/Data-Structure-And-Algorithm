class Pair implements Comparable<Pair>{
    int diff;
    int num;
    Pair(int diff , int num){
        this.diff = diff;
        this.num = num;
    }

    public int compareTo(Pair p){
        if(this.diff == p.diff){
           return this.num - p.num;
        }
        return this.diff - p.diff;
    }
}
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Pair>pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0 ; i<arr.length ; i++){
            int diff = Math.abs(x - arr[i]);
            pq.add(new Pair(diff , arr[i]));
            if(pq.size() > k){
                pq.remove();
            }
        }
        List<Integer>ans = new ArrayList<>();
        for(int i=0 ; i<k ; i++){
           Pair top = pq.remove();
           int z = top.num;
           ans.add(z);
        }

        Collections.sort(ans);

        return ans;
    }
}