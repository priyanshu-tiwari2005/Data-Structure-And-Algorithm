class Pair implements Comparable<Pair>{
   int freq;
   int num;

   public Pair(int freq , int num){
      this.freq = freq;
      this.num  = num;
   }

   public int compareTo(Pair p){
      return this.freq - p.freq ;
   }

}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Pair>pq = new PriorityQueue<>();
        HashMap<Integer , Integer>map = new HashMap<>();
        for(int i=0 ; i<nums.length ; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i] , 1);
            }else{
                map.put(nums[i] , map.get(nums[i])+1);
            }
        }
        for(int key : map.keySet()){
            int freq = map.get(key);
            pq.add(new Pair(freq , key));
             if(pq.size() > k){
               pq.remove();
            }
        }
        // for(int i=0 ; i<nums.length ; i++){
        //     int count = 0;
        //     for(int j = 0 ; j<nums.length ; j++){
        //         if(nums[i] == nums[j]){
        //             count++;
        //         }
        //     }
        //     pq.add(new Pair(count , nums[i]));
        //     if(pq.size() > k){
        //         pq.remove();
        //     }

        // }

        int ans[] = new int[k];
        int m = 0;
        while(!pq.isEmpty()){
            Pair top = pq.remove();
            int x = top.num ;
            ans[m++] = x;
        }
        return ans;
    }
}