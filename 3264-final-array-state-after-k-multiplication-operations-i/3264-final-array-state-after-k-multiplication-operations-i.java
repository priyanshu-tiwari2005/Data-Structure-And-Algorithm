class Solution {
    class pair{
        int value;
        int index;
        pair(int value , int index){
            this.value = value;
            this.index = index;
        }
    }
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int n = nums.length;
        PriorityQueue<pair>pq = new PriorityQueue<>(
            (a,b)->{
                if(a.value != b.value)
                  return a.value - b.value;
                
                return a.index - b.index ;
            }
        );

        

        for(int i=0 ; i<n ; i++){
            pq.add(new pair(nums[i] , i) );
        }

        while(k > 0){
            pair p  = pq.remove();
            int newValue = p.value * multiplier;
            nums[p.index] = newValue;
            pq.add(new pair(newValue , p.index));
            k--;
            
        }
        

        return nums;



    }
}