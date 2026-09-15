class Solution {
    public int singleNumber(int[] nums) {
       HashMap<Integer , Integer>freq = new HashMap<>();
       int n = nums.length;
       for(int i=0 ; i<n ;i++){
           if(!freq.containsKey(nums[i]) ){
              freq.put(nums[i] , 1);
           }else{
             freq.put(nums[i] , freq.get(nums[i]) + 1);
           }
        }

        for(int key : freq.keySet() ){
            int val = freq.get(key);
            if(val == 1){
                return key;
            }
        }
        return -1;
    }
}