class Pair implements Comparable<Pair>{
    int dist;
    int num;

    public Pair(int dist , int num){
        this.dist = dist;
        this.num = num;
    }
    public int compareTo(Pair p){
        if(this.dist == p.dist){

            return p.num - this.num;
        }
        return this.dist - p.dist;
    }
}
class Solution {
    public int findClosestNumber(int[] nums) {
        int n = nums.length;
        PriorityQueue<Pair>pq = new PriorityQueue<>();

        for(int i=0 ; i<n ; i++){
            pq.add(new Pair(Math.abs(nums[i]) , nums[i]));

        }
        Pair top = pq.remove();
        return top.num;
       
    }
}